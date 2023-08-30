<script lang="ts">
export default {
    name: "YB_Input_Text",
    props: {
        labelId: {
            default: "input_text_label",
            type: String
        },
        labelValue: {
            default: "Default label for text",
            type: String
        },
        inputId: {
            default: "input_text",
            type: String
        },
        inputPlaceholder: {
            default: "Text placeholder",
            type: String
        }
    },
    methods: {
        changeLabelColor(changeColor: boolean) {
            let inputTextLabel = document.getElementById('input_text_label') as HTMLLabelElement;
            if (changeColor) {
                inputTextLabel.style.color = "var(--yb-color-primary)";
            } else {
                inputTextLabel.style.color = "var(--yb-color-utility-black-2)";
            }
        }
    },
    data() {
        return {
            text: ""
        }
    }
}
</script>

<template>
    <div id="input_text_layout" class="input_text_layout">
        <label id="input_text_label" :for="inputId">{{ labelValue }}</label>
        <input type="text" :id="inputId" :name="inputId" :placeholder="inputPlaceholder" v-on:focus="changeLabelColor(true)"
            v-on:blur="changeLabelColor(false)" />
    </div>
</template>

<style scoped>
.input_text_layout {
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