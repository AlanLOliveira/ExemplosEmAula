package com.example.myapplication.model

class User(
    val nome: String,
    var email: String,
    val senha: String,
    var idade: Int
 ) {
    fun validarEmail(): Boolean{
        return email !=""
    }
    fun addIdade(novaIdade: Int){
        idade = idade + novaIdade;
    }
}