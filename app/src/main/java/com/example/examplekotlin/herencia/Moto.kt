package com.example.examplekotlin.herencia


class Moto(marca: String, modelo: String, private var cilindradas: Cilindradas): Vehiculo(marca, modelo) {



    fun getCilidradas(): Cilindradas {
        return cilindradas
    }

}