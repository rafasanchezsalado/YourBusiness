<script lang="ts">
export default {
    name: "YB_Input_Checkbox",
    props: {
        labelId: {
            default: "input_checkbox_label",
            type: String
        },
        labelValue: {
            default: "Default label",
            type: String
        },
        checkboxId: {
            default: "input_checkbox",
            type: String
        },
        checkboxValue: {
            default: "Default text",
            type: String
        },
        labelValues: {
            default: ["Value 1", "Value 2", "Value 3"],
            type: Array
        },
    }
    // data() {
    //     return {

    //     }
}
</script>

<template>
    <div id="input_checkboxs_layout" class="input_checkboxs_layout">
        <div id="input_checkbox_layout" class="input_checkbox_layout" v-for="labelValue in labelValues">
            <input type="checkbox" :id="checkboxId" :name="checkboxId" :placeholder="checkboxValue" />
            <label :id="(labelValue as string)" :for="checkboxId">{{ labelValue }}</label>
        </div>
    </div>
</template>

<style scoped>
.input_checkboxs_layout {
    display: grid;
    grid-template-rows: auto;
    row-gap: .5rem;
    margin: 1rem 0;
}

.input_checkbox_layout {
    display: grid;
    grid-template-columns: auto 1fr;
    column-gap: .5rem;
    align-items: center;
    align-self: center;
    align-content: center;
}

input {
    display: inline-block;
    border: 2px solid var(--yb-color-utility-black-4);
    border-radius: .125rem;
    width: 1rem;
    height: 1rem;
    cursor: pointer;
    position: relative;
}

input::before {
    content: "";
    display: block;
    width: calc(100% - .125rem);
    height: calc(100% - .125rem);
    position: absolute;
    top: .0625rem;
    left: .0625rem;
    background-color: transparent;
    border-radius: .0625rem;
}

input:checked::before {
    background-color: var(--yb-color-primary);
}

label {
    color: var(--yb-color-utility-black-3);
    font-weight: 500;
}
</style>