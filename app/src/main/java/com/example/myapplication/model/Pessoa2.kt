package com.example.myapplication.model

open class Pessoa2(
        val nome: String,
        val sobrenome: String,
        val idade: Int

) {

    open fun correr(){
        println("Rápido")
    }

    fun idade (){
     println("MInha idade é $idade")
    }
}