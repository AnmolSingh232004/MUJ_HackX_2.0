<template>
    <div id="cont">

        <div>
            <div>
                <h2>आपदा रक्षक!</h2>
                <p>You have reached online disaster helpline, you can report a disaster now, or call our support
                    helpline.
                </p>

                <h1>Login/Signup</h1>
            </div>
        </div>
        <div>
            <v-text-field
                class="v-input-username"
                v-model="value"
                density="default"
                color="#fff"
                variant="outlined"
                base-color="#fff"
                label="Username"
            ></v-text-field>

            <v-text-field
                class="v-input-password"
                v-model="password"
                :append-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
                :type="showPassword ? 'text' : 'password'"
                label="Password"
                hint="At least 8 characters"
                @click:append="togglePasswordVisibility"
                :rules="[rules.required, rules.minLength]"
            ></v-text-field>
            <br>
            <v-btn theme="dark" variant="outlined" base-color="#fff">Submit</v-btn>
        </div>
    </div>
</template>
<script>



export default {
    
    name: "AuthorisationComponent",
    components: {
        
    },
    data: () => {
        return {
            username: null,
            password: null,
            showPassword: false,
            valid: true,
            rules: {
                required: value => !!value || 'Required.',
                minLength: v => v.length >= 8 || 'Min 8 characters',
            },
        }
    },
    methods: {
    togglePasswordVisibility() {
      this.showPassword = !this.showPassword;
    },
  }
}
</script>

<style scoped>
body {
    background-color: #000;
    margin: 0px;
    overflow: hidden;
}

h2 {
    color: white;
    font-size: 300%;
    border: 1px solid #fff;
    width: 20vw;
    margin: auto;
    margin-bottom: 2%;
    padding: 1% 0% 1% 0%;
    border-radius: 15px;
}

p {
    color: white;
}

h1 {
    color: #ff0000;
    margin-top: 5%;
}

#cont>div:nth-child(2),
#cont>div:nth-child(3),
#cont>div:nth-child(4) {
    width: 25%;
    margin: auto;
    justify-content: center;
    margin-top: 1%;
}

.v-input-username{
    color: white;
    width: 90%;
}

.v-input-password{
    color: white;
}
</style>