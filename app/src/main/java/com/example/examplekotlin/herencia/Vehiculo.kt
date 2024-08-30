package com.example.examplekotlin.herencia

// Clase modelo
open class Vehiculo(val marca: String, val modelo: String) {

    open fun conducir() {
        println("El vehiculo - $marca. $modelo esta en movimiento.")
    }

}