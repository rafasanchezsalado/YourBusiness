<script lang="ts">
import YB_Input_Text from '../components/form/YB_Input_Text.vue';
import YB_Input_Password from '../components/form/YB_Input_Password.vue';
import YB_Button_Primary from '../components/buttons/YB_Button_Primary.vue';
export default {
    name: "YB_Sign_In",
    components: {
        YB_Input_Text,
        YB_Input_Password,
        YB_Button_Primary
    },
}
</script>

<template>
    <YB_Input_Text :label-id="'username_label'" :label-value="'Username'" :input-id="'username_input'"
        :input-placeholder="'Username'">
    </YB_Input_Text>
    <YB_Input_Password :label-id="'password_label'" :label-value="'Password'" :input-id="'password_input'"
        :input-placeholder="'Password'"></YB_Input_Password>
    <YB_Button_Primary></YB_Button_Primary>
</template>

<style scoped></style>