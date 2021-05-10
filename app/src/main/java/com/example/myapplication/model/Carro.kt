package com.example.myapplication.model

class Carro (
    val nome: String,
    val ano: Int,
    val cor: CarroCor

    )
{
    fun acelerar() {
        println("$nome acelerando....")
    }
    private fun frear(){

    }
    fun buscarDescricaoCompleta() : String{
        frear()
        return "$nome---$ano---$cor"
    }
}
