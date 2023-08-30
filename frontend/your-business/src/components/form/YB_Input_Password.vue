<script lang="ts">
export default {
    name: "YB_Input_Password",
    props: {
        labelId: {
            default: "input_password_label",
            type: String
        },
        labelValue: {
            default: "Default label for password",
            type: String
        },
        inputId: {
            default: "input_password",
            type: String
        },
        inputPlaceholder: {
            default: "Password placeholder",
            type: String
        }
    },
    methods: {
        changeLabelColor(changeColor: boolean) {
            let inputPasswordLabel = document.getElementById(this.labelId) as HTMLLabelElement;
            if (this.errors.length == 0) {
                if (changeColor) {
                    inputPasswordLabel.style.color = "var(--yb-color-primary)";
                } else {
                    inputPasswordLabel.style.color = "var(--yb-color-utility-black-2)";
                }
            }
        },
    },
    data() {
        return {
            password: '',
            errors: [] as string[]
        }
    }
}
</script>

<template>
    <div id="input_password_layout" class="input_password_layout">
        <label id="input_password_label" :for="labelId">{{ labelValue }}</label>
        <input type="password" v-model="password" :id="inputId" :name="inputId" :placeholder="inputPlaceholder"
            v-on:focus="changeLabelColor(true)" v-on:blur="changeLabelColor(false)" required />
    </div>
</template>

<style scoped>
.input_password_layout {
    display: grid;
    grid-template-rows: auto 1fr;
    row-gap: .5rem;
    margin: 1rem 0;
}

label {
    font-weight: 600;
    display: block;
    color: var(--yb-color-utility-black-2);
}

input {
    color: var(--yb-color-utility-black-2);
    border: 1px solid var(--yb-color-utility-black-4);
    outline: 1px solid var(--yb-color-utility-black-4);
    border-radius: .5rem;
    padding: 1rem;
}

input::placeholder {
    color: var(--yb-color-utility-black-4);
}

input:focus {
    border: 1px solid var(--yb-color-primary);
    outline: 1px solid var(--yb-color-primary);
}
</style>