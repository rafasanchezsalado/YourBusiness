<script lang="ts">
import YB_Sign_In from '../components/YB_Sign_In.vue';
import YB_Sign_Up from '../components/YB_Sign_Up.vue';
export default {
    name: "YB_Login",
    components: {
        YB_Sign_In,
        YB_Sign_Up
    },
    methods: {
        changeLoginOption(item: PointerEvent) {
            var target = item.target as HTMLElement;
            var loginContainer = document.getElementById("login_container_layout") as HTMLElement;
            var signInElement = document.getElementById("login_sign_in_btn") as HTMLButtonElement;
            var signUpElement = document.getElementById("login_sign_up_btn") as HTMLButtonElement;
            var border1 = document.getElementById("border_transparent_1") as HTMLDivElement;
            var border2 = document.getElementById("border_transparent_2") as HTMLDivElement;
            //
            if (target.classList.contains("no_selected")) {
                signInElement.classList.toggle("selected");
                signInElement.classList.toggle("no_selected");
                signUpElement.classList.toggle("selected");
                signUpElement.classList.toggle("no_selected");
                //
                if (target.id === signInElement.id) {
                    loginContainer.style.borderRadius = "0 1rem 1rem 1rem";
                    border1.style.display = "block";
                    border2.style.display = "none";
                    this.changeLoginView(signInElement.id);

                }
                if (target.id === signUpElement.id) {
                    loginContainer.style.borderRadius = "1rem 0 1rem 1rem";
                    border1.style.display = "none";
                    border2.style.display = "block";
                    this.changeLoginView(signUpElement.id);
                }
            }
        },
        changeLoginView(elementId: string) {
            var signInElement = document.getElementById("login_signin_view") as HTMLDivElement;
            var signUpElement = document.getElementById("login_signup_view") as HTMLDivElement;
            //
            if (elementId.includes("_in_")) {
                signInElement.style.display = "block";
                signUpElement.style.display = "none";
            } else if (elementId.includes("_up_")) {
                signInElement.style.display = "none";
                signUpElement.style.display = "block";
            }
        }
    }
}
</script>

<template>
    <div class="login_layout">
        <div class="login_options_layout">
            <a id="login_option" href="components#signin">
                <button id="login_sign_in_btn" class="selected" v-on:click="changeLoginOption($event as PointerEvent)">
                    Sign in
                </button>
            </a>
            <a id="login_option" href="components#signup">
                <button id="login_sign_up_btn" class="no_selected" v-on:click="changeLoginOption($event as PointerEvent)">
                    Create account
                </button>
            </a>
        </div>
        <div id="login_container_layout" class="login_container_layout">
            <div id="login_signin_view" class="login_signin_view">
                <YB_Sign_In></YB_Sign_In>
            </div>
            <div id="login_signup_view" class="login_signup_view">
                <YB_Sign_Up></YB_Sign_Up>
            </div>
        </div>
    </div>
</template>

<style scoped>
.login_layout {
    margin: 1rem 0;
}

.login_options_layout {
    display: flex;
}

.login_container_layout {
    width: 100%;
    display: flex;
    border-radius: 0 1rem 1rem 1rem;
    border: 2px solid var(--yb-color-utility-black-4);
    background-color: var(--yb-color-utility-white-1);
    padding: 0 1rem;
}

.login_signin_view {
    width: 100%;
}

.selected {
    border-radius: .5rem .5rem .125rem .125rem;
    color: var(--yb-color-utility-white-1);
    outline: 2px solid var(--yb-color-utility-black-4);
    background-color: var(--yb-color-primary);
}

.no_selected {
    background-color: transparent;
}

.no_selected:hover {
    color: var(--yb-color-primary);
}

#login_option {
    width: 100%;
}
</style>