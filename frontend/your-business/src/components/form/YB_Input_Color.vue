<script lang="ts">
import YB_Input_Radio from '../form/YB_Input_Radio.vue';
import YB_Input_Select from '../form/YB_Input_Select.vue';
export default {
    name: "YB_Input_Color",
    components: {
        YB_Input_Radio,
        YB_Input_Select
    },
    props: {
        colorId: {
            default: "input_color",
            type: String
        },
        colorName: {
            default: "input_color",
            type: String
        },
        colorValue: {
            default: "#000000",
            type: String
        },
        labelId: {
            default: "input_color_label",
            type: String
        },
        labelValue: {
            default: "Default label",
            type: String
        }
    },
    methods: {
        checkDisability() {
            var inputBlock = document.getElementById("input_color_layout") as HTMLDivElement;
            var inputColor = document.getElementById(this.colorId) as HTMLInputElement;
            if (inputColor?.disabled) {
                // inputBlock.style.backgroundColor = "#808080";
                inputBlock.style.opacity = "0.25";
            }
        }
    },
    data() {
        var primary: string = "#8080ff" != null ? "#8080ff" : localStorage.getItem('default-primary')!;
        var secondary: string = "#a0a0ff" != null ? "#a0a0ff" : localStorage.getItem('default-secondary')!;
        var tertiary: string = "#c0c0ff" != null ? "#c0c0ff" : localStorage.getItem('default-tertiary')!;
        var success: string = "#80ff80" != null ? "#80ff80" : localStorage.getItem('default-success')!;
        var warning: string = "#ffa580" != null ? "#ffa580" : localStorage.getItem('default-warning')!;
        var error: string = "#ff8080" != null ? "#ff8080" : localStorage.getItem('default-error')!;
        return {
            colorValues: new Map<string, string>([
                ["Primary", primary],
                ["Secondary", secondary],
                ["Tertiary", tertiary],
                ["Success", success],
                ["Warning", warning],
                ["Error", error],
            ]),
        };
    }
}
</script>

<template>
    <YB_Input_Select :set-color-palette-type="(true as boolean)"></YB_Input_Select>
    <!-- <YB_Input_Radio :set-color-palette-type="(true as boolean)"></YB_Input_Radio> -->
    <div id="input_colors_layout" class="input_colors_layout">
        <div id="input_color_layout" class="input_color_layout" v-for="color in colorValues">
            <input type="color" :id="colorId" :name="colorName" :value="color[1]" />
            <label :id="labelId" :for="colorId">{{ color[0] }}</label>
        </div>
    </div>
</template>

<style scoped>
.input_colors_layout {
    margin: 1rem 0;
    display: grid;
    column-gap: 1rem;
}

@media screen and (min-width: 800px) {
    .input_colors_layout {
        grid-template-columns: 1fr 1fr 1fr;
        columns: 3;
    }
}

@media screen and (min-width: 300px) and (max-width: 600px) {
    .input_colors_layout {
        grid-template-columns: 1fr;
        columns: 1;
    }
}

.input_color_layout {
    display: grid;
    grid-template-columns: auto 1fr;
    column-gap: 1rem;
    align-items: center;
    align-content: center;
    border: 2px solid transparent;
    padding: 1rem;
}

.input_color_layout:hover {
    border: 2px solid var(--yb-color-utility-black-4);
    border-radius: .5rem;
}

label {
    color: var(--yb-color-utility-black-2);
    font-weight: 500;
}

input {
    appearance: none;
    -moz-appearance: none;
    -webkit-appearance: none;
    background-color: transparent;
    width: 3rem;
    height: 3rem;
    border-radius: .5rem;
    cursor: pointer;
    border: none;
}

input::-webkit-color-swatch {
    border: none;
    border-radius: .5rem;
}

input::-moz-color-swatch {
    border: none;
    border-radius: .5rem;
}
</style>