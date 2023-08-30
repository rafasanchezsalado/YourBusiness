<script lang="ts">
export default {
    name: "YB_Input_Select",
    props: {
        selectId: {
            default: "input_radio",
            type: String
        },
        selectName: {
            default: "input_select",
            type: String
        },
        setColorPaletteType: {
            default: false,
            type: Boolean
        }
    },
    methods: {
        setColorPaletteTypes() {
            this.selectOptions = ["custom", "monochromatic", "analogous", "complementary", "triadic", "tetradic"]
        }
    },
    mounted() {
        if (this.setColorPaletteType == true) {
            this.setColorPaletteTypes()
        }
    },
    data() {
        return {
            selection: "",
            selectOptions: [] as Array<String>,
        }
    },
}
</script>

<template>
    <div id="input_select_layout" class="input_select_layout">
        <select :id="selectId" :name="selectName" disabled>
            <option :value="option" v-for="option in selectOptions">
                {{ option.charAt(0).toUpperCase() + option.substring(1, option.length) }}
            </option>
        </select>
    </div>
</template>

<style scoped>
.input_select_layout {
    margin: 1rem 0;
}

select {
    color: var(--yb-color-utility-black-3);
    font-size: 1rem;
    border: 2px solid var(--yb-color-utility-black-4);
    border-radius: .5rem;
    padding: 1rem;
}

select:focus {
    border: 2px solid var(--yb-color-primary);
}

option {
    background-color: var(--yb-color-utility-white-4);
}

/* 
option:checked {
    background-color: var(--yb-color-primary);
}
*/
</style>