<script setup lang="ts">
function setDefaultValues() {
    localStorage.setItem("color-primary-default", "#0000ff");
    localStorage.setItem("color-secondary-default", "#00ffff");
    localStorage.setItem("color-tertiary-default", "#ffff00");
    localStorage.setItem("color-error-default", "#ff0000");
    localStorage.setItem("color-warning-default", "#ffa500")
    localStorage.setItem("color-success-default", "#00ff00");
    //
    sessionStorage.setItem("color-primary-default", "#0000ff");
    sessionStorage.setItem("color-secondary-default", "#00ffff");
    sessionStorage.setItem("color-tertiary-default", "#ffff00");
    sessionStorage.setItem("color-error-default", "#ff0000");
    sessionStorage.setItem("color-warning-default", "#ffa500")
    sessionStorage.setItem("color-success-default", "#00ff00");
}
</script>

<template>
    <main>
        <router-link to="/home">Sign In</router-link>
        <br>
        <router-link to="/setup" @vue:mounted="setDefaultValues()">Sign Up</router-link>
    </main>
</template>
