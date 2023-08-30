<script lang="ts">
export default {
    name: "YB_Button_Secondary",
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
        <button :id="buttonId" class="secondary" :name="buttonId">{{ buttonValue }}</button>
    </div>
</template>

<style scoped>
.form_button_layout {
    margin: 1rem 0;
}

button {
    cursor: pointer;
}

.secondary {
    background-color: transparent;
    color: var(--yb-color-primary);
    border: 2px solid var(--yb-color-primary);
}

.secondary:hover {
    opacity: .75;
}
</style>