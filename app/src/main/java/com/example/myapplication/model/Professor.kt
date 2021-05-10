package com.example.myapplication.model

open class Professor(nome: String, sobrenome: String, cpf: String) : Pessoa(nome, sobrenome) {
    val cpf = Int
         open fun nome () {
        println("Nome do professor é: $nome")
    }
     open fun sobrenome(){
        println("Seu sobrenome é $sobrenome")
    }
   override fun correr(){
       println("Voando")
   }
    fun pessoafisica(){
        println("Seu cpf é $cpf")
    }
}
