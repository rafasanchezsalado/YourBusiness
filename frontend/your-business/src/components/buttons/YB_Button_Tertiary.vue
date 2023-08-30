<script lang="ts">
export default {
    name: "YB_Button_Tertiary",
    props: {
        buttonId: {
            default: "default_button",
            type: String
        },
        buttonValue: {
            default: "Default",
            type: String
        }
    }
}
</script>

<template>
    <div id="form_button_layout" class="form_button_layout">
        <button :id="buttonId" class="tertiary" :name="buttonId">{{ buttonValue }}</button>
    </div>
</template>

<style scoped>
.form_button_layout {
    margin: 1rem 0;
}

button {
    cursor: pointer;
}

.tertiary {
    background-color: transparent;
    color: var(--yb-color-utility-black-3);
    border: 2px solid var(--yb-color-utility-black-3);
}

.tertiary:hover {
    opacity: .75;
}
</style>