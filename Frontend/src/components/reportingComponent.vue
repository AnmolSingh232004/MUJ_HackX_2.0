<template>
    <div id="cont">
      <div>
        <div>
          <h2>आपदा रक्षक!</h2>
          <p>You have reached the online disaster helpline. You can report a disaster now or call our support helpline.</p>
        </div>
      </div>
  
      <v-form ref="form" v-model="valid" @submit.prevent="submitForm">
        <v-autocomplete
          class="v_input"
          v-model="disaster"
          :items="disasterOptions"
          density="default"
          color="#fff"
          variant="outlined"
          base-color="#fff"
          label="Disaster"
          :rules="[rules.required]"
          v-model:search-input="search"
          @update:search="addCustomOption"
        ></v-autocomplete>
  
        <v-autocomplete
          class="v_input"
          v-model="severity"
          :items="severityOptions"
          density="default"
          color="#fff"
          variant="outlined"
          base-color="#fff"
          label="Severity"
          :rules="[rules.required]"
        ></v-autocomplete>
  
        <v-text-field
          class="v_input"
          v-model="victims"
          density="default"
          type="number"
          color="#fff"
          variant="outlined"
          base-color="#fff"
          label="Victims"
          :rules="[rules.required, rules.number]"
        ></v-text-field>
  
        <v-file-input
          class="v_input"
          v-model="image"
          density="default"
          color="#fff"
          variant="outlined"
          base-color="#fff"
          label="Upload Image"
          :rules="[rules.required]"
          accept="image/*"
        ></v-file-input>
        
        <br>
        <v-btn theme="dark" variant="outlined" base-color="#fff" type="submit">Submit</v-btn>
      </v-form>
  
      <v-snackbar v-model="snackbar" color="success" :timeout="3000">
        Request under process, we will get back to you soon!. Redirecting in {{ countdown }} seconds...
      </v-snackbar>
    </div>
  </template>
<script>
export default {
    name: "reportComponent",
    data: () => ({
        disaster: null,
        disasterOptions: ['Earthquake', 'Tsunami', 'Flood', 'Fire', 'Violence', 'Explosion', 'Road Accident', 'Terrorism', 'Drought', 'Protest', 'Animal attack'],
        severity: null,
        severityOptions: ['Critical!', 'Extreme', 'High', 'Medium', 'Low'],
        victims: null,
        image: null,
        search: '',
        valid: true,
        snackbar: false,
        countdown: 3,
        rules: {
            required: value => !!value || 'Required.',
            number: value => !isNaN(value) || 'Must be a number.',
        },
    }),
    methods: {
        addCustomOption(search) {
            this.disasterOptions = [search, 'Earthquake', 'Tsunami', 'Flood', 'Fire', 'Violence', 'Explosion', 'Road Accident', 'Terrorism', 'Drought', 'Protest', 'Animal attack'];
        },
        submitForm() {
            if (this.$refs.form.validate() && this.disaster, this.severity, this.victims) {
                // Handle form submission
                this.snackbar = true;
                this.startCountdown();
            }
        },
        startCountdown() {
            const interval = setInterval(() => {
                if (this.countdown > 0) {
                    this.countdown--;
                } else {
                    clearInterval(interval);
                    this.$router.push('/');
                }
            }, 1000);
        },
    },
};
</script>

<style scoped>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
}

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

#cont {
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;
}

#cont>form>div:nth-child(1),
#cont>form>div:nth-child(2),
#cont>form>div:nth-child(3),
#cont>form>div:nth-child(4) {
    width: 25%;
    margin: auto;
    justify-content: center;
    margin-top: 1%;
}

.v_input {
    color: #fff;
}
</style>