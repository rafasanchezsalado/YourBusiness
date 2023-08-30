<script setup lang="ts">
import YB_Input_Text from '../components/form/YB_Input_Text.vue';
import YB_Input_Password from '../components/form/YB_Input_Password.vue';
import YB_Input_Color from '../components/form/YB_Input_Color.vue';
import YB_Input_Checkbox from '../components/form/YB_Input_Checkbox.vue';
import YB_Button_Primary from '../components/buttons/YB_Button_Primary.vue';
import YB_Button_Secondary from '../components/buttons/YB_Button_Secondary.vue';
import YB_Button_Tertiary from '../components/buttons/YB_Button_Tertiary.vue';
import YB_Button_Text from '../components/buttons/YB_Button_Text.vue';
import YB_Separator from '../components/form/YB_Separator.vue';
</script>

<template>
    <YB_Input_Text></YB_Input_Text>
    <YB_Separator></YB_Separator>
    <YB_Input_Password></YB_Input_Password>
    <YB_Separator></YB_Separator>
    <YB_Input_Color></YB_Input_Color>
    <YB_Separator></YB_Separator>
    <YB_Input_Checkbox></YB_Input_Checkbox>
    <YB_Separator></YB_Separator>
    <YB_Button_Primary></YB_Button_Primary>
    <YB_Separator></YB_Separator>
    <YB_Button_Secondary></YB_Button_Secondary>
    <YB_Separator></YB_Separator>
    <YB_Button_Tertiary></YB_Button_Tertiary>
    <YB_Separator></YB_Separator>
    <YB_Button_Text></YB_Button_Text>
</template>

<style scoped></style>