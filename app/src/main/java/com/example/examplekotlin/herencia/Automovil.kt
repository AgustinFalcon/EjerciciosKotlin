package com.example.examplekotlin.herencia


class Automovil(marca: String, modelo: String, val cantPuertas: Int) : Vehiculo(marca, modelo)  {


    override fun conducir() {
        println("$marca y $modelo")
    }


    fun abrirPuerta() {
        println("Las $cantPuertas esta abiertas")
    }

}