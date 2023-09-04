<script lang="ts">
export default {
    name: "YB_Button_Primary",
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
        <button :id="buttonId" class="primary" :name="buttonId">{{ buttonValue }}</button>
    </div>
</template>

<style scoped>
.form_button_layout {
    margin: 1rem 0;
}

button {
    cursor: pointer;
}

.primary {
    background-color: var(--yb-color-primary);
    color: var(--yb-color-utility-white-1);
}

.primary:hover {
    opacity: .75;
}
</style>