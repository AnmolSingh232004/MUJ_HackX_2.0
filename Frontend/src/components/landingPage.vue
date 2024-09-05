<template>
    <div id="cont">
        <div>
            <div>
                <h2>आपदा रक्षक!</h2>
                <p>You have reached online disaster helpline, you can report a disaster now, or call our support
                    helpline.</p>
            </div>
        </div>
        <div>
            <button>
                <router-link to="/report" style="text-decoration: none;">
                    <p>Report Now!</p>
                </router-link>
            </button>
        </div>
        <div>
            <div>
                <router-link to="/authorise">
                    <p>Signup/Login</p>
                </router-link>
                <button>
                    <img src="../../src/assets/phone.svg" alt="">
                    <p>Call helpline (0000)</p>
                </button>
                <div>
                    <img src="../../src/assets/warning.svg" alt="">
                    <p>Reporting false incidents or spamming is a punishable offense under the law.</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'LandingPage',
    components: {
    }
}
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
    /* border-style: dotted; */
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

#cont>div {
    width: 100%;
    /* border: 1px solid white; */
    height: 32vh;
    display: flex;
    align-items: center;
}

#cont>div>div {
    text-align: center;
    width: 100%;
}

#cont>div>p {
    margin: auto;
}

#cont>div>button {
    margin: auto;
    width: 20%;
    height: 10vh;
    border-radius: 5px;
    border: 0px;
    background-color: #ff0000;
    cursor: pointer;
}

button>p {
    color: white;
}

#cont>div>div>button {
    background-color: brown;
    border-radius: 5px;
    border: 0px;
    width: 10%;
    cursor: pointer;
    display: flex;
    margin: auto;
    margin: 1.5% auto 3.5% auto;
    justify-content: space-evenly;
    align-items: center;
}

button>img {
    width: 15%;
}

#cont>div:nth-child(3)>div>p {
    cursor: pointer;
}

#cont>div:nth-child(2)>button>p {
    font-size: x-large;
    font-weight: bolder;
}

#cont>div>div>div {
    display: flex;
    justify-content: center;
}

#cont>div>div>div>img {
    width: 1.7%;
    margin: 0% 0.3% 0% 1%;
}
</style>