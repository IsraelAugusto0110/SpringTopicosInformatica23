<template>
  <div class="about">
    <h1>Olá {{ nome }}!</h1>
    <input type="text" v-model="nome" />
    <p v-if="nome.length > 5">Texto longo</p>
    <p v-else>Texto curto</p>
    <p>{{ contador }} <button @click="incrementar">Incrementar</button></p>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
const nome = ref('Sorvete')
const contador = ref(1)
function incrementar() {
  contador.value++
}
</script>
