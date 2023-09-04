<script setup lang="ts">
import YB_Input_Text from '../components/form/YB_Input_Text.vue';
import YB_Button_Primary from '../components/buttons/YB_Button_Primary.vue';
import YB_Button_Secondary from '../components/buttons/YB_Button_Secondary.vue';
import YB_Button_Tertiary from '../components/buttons/YB_Button_Tertiary.vue';
import { RouterLink } from 'vue-router';

class Business {
    id: string;
    name: string;
    colorPrimary: string;
    colorSecondary: string;
    colorTertiary: string;
    colorError: string;
    colorWarning: string;
    colorSuccess: string;
    constructor(id: string, name: string, colorPrimary: string, colorSecondary: string, colorTertiary: string, colorError: string, colorWarning: string, colorSuccess: string) {
        this.id = id;
        this.name = name;
        this.colorPrimary = colorPrimary;
        this.colorSecondary = colorSecondary;
        this.colorTertiary = colorTertiary;
        this.colorError = colorError;
        this.colorWarning = colorWarning;
        this.colorSuccess = colorSuccess;
    }
}

function setData() {
    const businessNameValue = (document.getElementById('input_business_name') as HTMLInputElement).value;
    const primary: string = localStorage.getItem('default-primary')!;
    const secondary: string = localStorage.getItem('default-secondary')!;
    const tertiary: string = localStorage.getItem('default-tertiary')!;
    const error: string = localStorage.getItem('default-error')!;
    const warning: string = localStorage.getItem('default-warning')!;
    const success: string = localStorage.getItem('default-success')!;
    const colorPaletteMain: Array<string> = [primary, secondary, tertiary];
    const colorPaletteUtility: Array<string> = [error, warning, success];
    sendRequest(businessNameValue, colorPaletteMain, colorPaletteUtility);
}

async function sendRequest(businessName: string, colorPalette: Array<string>, colorPaletteUtility: Array<string>) {
    // create request body
    const data: Business = new Business("", businessName, colorPalette[0], colorPalette[1], colorPalette[2], colorPaletteUtility[0], colorPaletteUtility[1], colorPaletteUtility[2]);
    const dataJson: string = JSON.stringify(data);
    // const requestJson: JSON = JSON.parse(dataJson);
    console.log(dataJson);
    // create the request
    try {
        const urlStr = 'localhost:8000/business';
        const url: URL = new URL(urlStr);
        const response = await fetch(url, { method: "POST", body: dataJson });
        console.log(response);
        if (response.ok) {
            saveDataInStorage(businessName, colorPalette, colorPaletteUtility);
        } else {
            // 
        }
    } catch (error) {
        console.error(error);
    }
}

function saveDataInStorage(businessName: string, colorPalette: Array<string>, colorPaletteUtility: Array<string>) {
    localStorage.setItem('business-name', businessName);
    localStorage.setItem("color-primary", colorPalette[0]);
    localStorage.setItem("color-secondary", colorPalette[1]);
    localStorage.setItem("color-tertiary", colorPalette[2]);
    localStorage.setItem("color-error", colorPaletteUtility[0]);
    localStorage.setItem("color-warning", colorPaletteUtility[1])
    localStorage.setItem("color-success", colorPaletteUtility[2]);
    //
    sessionStorage.setItem('business-name', businessName);
    sessionStorage.setItem("color-primary", colorPalette[0]);
    sessionStorage.setItem("color-secondary", colorPalette[1]);
    sessionStorage.setItem("color-tertiary", colorPalette[2]);
    sessionStorage.setItem("color-error", colorPaletteUtility[0]);
    sessionStorage.setItem("color-warning", colorPaletteUtility[1])
    sessionStorage.setItem("color-success", colorPaletteUtility[2]);
}
</script>

<template>
    <main>
        <h3>Set up your business!</h3>
        <YB_Input_Text :label-id="'label_business_name'" :label-value="'Business name'" :input-id="'input_business_name'"
            :input-placeholder="'Insert your business name'">
        </YB_Input_Text>
        <div id="setup_form_buttons" class="setup_form_buttons">
            <YB_Button_Tertiary :button-value="'Skip'"></YB_Button_Tertiary>
            <YB_Button_Secondary :button-value="'Next'"></YB_Button_Secondary>
        </div>
        <!-- <router-link to="/home"> -->
        <YB_Button_Primary :button-id="'button_business'" :button-value="'Save'" v-on:click="setData">
        </YB_Button_Primary>
        <!-- </router-link> -->
    </main>
</template>

<style scoped>
.setup_form_buttons {
    display: flex;
    gap: 1rem;
    justify-content: end;
}

.setup_form_buttons * {
    width: 100%;
}

/* XS */
@media (width < 480px) {}

/* SM */
@media (width >=480px) and (width < 768px) {}

/* MD */
@media (width >=768px) and (width < 1024px) {}

/* LG */
@media (width >=1024px) and (width < 1440px) {}

/* XL */
@media (width >=1440px) {}
</style>