<script lang="ts">
export default {
    name: "YB_Input_Radio",
    props: {
        radioId: {
            default: "input_radio",
            type: String
        },
        radioName: {
            default: "input_radio",
            type: String
        },
        labelId: {
            default: "input_radio_label",
            type: String
        },
        labelValue: {
            default: "Default label",
            type: String
        },
        setColorPaletteType: {
            default: false,
            type: Boolean
        }
    },
    data() {
        return {
            option: "",
            radioOptions: [] as Array<String>,
        };
    },
    methods: {
        setColorPaletteTypes() {
            this.radioOptions = ["custom", "monochromatic", "analogous", "complementary", "triadic", "tetradic"]
        }
    },
    mounted() {
        if (this.setColorPaletteType == true) {
            this.setColorPaletteTypes()
        }
    }
}
</script>

<template>
    <div id="input_radio_layout" class="input_radio_layout">
        <div id="input_radio_container" class="input_radio_container" v-if="radioOptions.length > 0"
            v-for="option in radioOptions">
            <input type="radio" id="radioId" name="radioName" value="option" />
            <label for="option">{{ option.charAt(0).toUpperCase() + option.substring(1, option.length) }}</label>
        </div>
    </div>
</template>

<style scoped>
.input_radio_layout {
    margin: 1rem 0;
    display: flex;
    gap: 1rem;
    justify-content: space-between;
}

.input_radio_container {
    display: flex;
    align-items: center;
    align-self: center;
    align-content: center;
    gap: .5rem;
}

.type {
    display: grid;
    grid-template-columns: auto 1fr;
    gap: .5rem;
    align-items: center;
    align-self: center;
    align-content: center;
}

label {
    color: var(--yb-color-utility-black-3);
    font-size: 1.25rem;
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

input[type="radio"] {
    content: "";
    position: relative;
    width: 1rem;
    height: 1rem;
    border: 2px solid var(--yb-color-utility-black-4);
    border-radius: 50%;
    background-color: #fff;
}

input[type="radio"]:checked {
    outline: none;
    border: none;
    width: 1rem;
    height: 1rem;
    background-color: var(--yb-color-primary);
}
</style>