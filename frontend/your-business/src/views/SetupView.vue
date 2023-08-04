<script setup lang="ts">
import TheWelcome from '../components/TheWelcome.vue'
</script>

<template>
    <main>
        <form action="">

            <h3>Set up your business!</h3>
            <br>
            <h4>Data</h4>
            <br>
            <label>Name</label>
            <input type="text" value="" />
            <br>
            <h4>Color palette</h4>
            <br>
            <label>Primary color</label>
            <input type="color" />
            <br>
            <label>Secondary color</label>
            <input type="color" />
            <br>
            <h4>Social media</h4>
            <br>
            <label>Facebook</label>
            <input type="text" value="" />
            <br>
            <label>Instagram</label>
            <input type="text" value="" />
            <br>
            <label>Threads</label>
            <input type="text" value="" />
            <br>
            <router-link to="/home">
                <button>Continue</button>
            </router-link>

        </form>
    </main>
</template>