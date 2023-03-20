<template>
  <div class="about">
    <h1>Olá {{ nome }}!</h1>
    <input type="text" v-model="nome" />
    <input type="password" v-model="senha" />
    <button @click="cadastrar">Cadastrar</button>
    <p v-if="nome.length > 5">Texto longo</p>
    <p v-else>Texto curto</p>
    <p>{{ contador }} <button @click="incrementar">Incrementar</button></p>
    <button @click="atualizar">Atualizar</button>
    <table>
      <thead>
        <th>Id</th>
        <th>Nome</th>
      </thead>
      <tr v-for="usuario in usuarios" key="usuario.id">
        <td>{{ usuario.id }}</td>
        <td>{{ usuario.nome }}</td>
      </tr>
    </table>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import axios from 'axios'
const nome = ref('Sorvete')
const senha = ref('123')
const contador = ref(1)
const usuarios = ref()
function incrementar() {
  contador.value++
}
async function atualizar() {
  usuarios.value = (await axios.get('/usuario')).data
}

async function cadastrar() {
  await axios.post('/usuario', {
    nome: nome.value,
    senha: senha.value
  })
  atualizar()
}

onMounted(() => {
  atualizar()
})
</script>
