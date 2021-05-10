package com.example.myapplication.model

open class Pessoa
(
    val nome: String,
    val sobrenome: String
){
    open fun correr(){
        println("Correndo...")
            }
    fun devagar(){
        println("Lentamente")
    }


}




