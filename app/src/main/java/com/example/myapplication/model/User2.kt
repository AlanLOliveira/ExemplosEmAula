package com.example.myapplication.model

class User2(
       val email : String,
       val senha: String
) {
    fun validarEmail(): Boolean {
        return email !=""
    }
    fun validarSenha(): Boolean{
        return senha !="" && senha.length>=6
    }

    override fun toString(): String {
        return "$email $senha"
    }

}