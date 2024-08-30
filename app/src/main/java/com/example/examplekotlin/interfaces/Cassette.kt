package com.example.examplekotlin.interfaces

import com.example.examplekotlin.polimorfismo.Animal


class Cassette(val name: String, val author: String): Grabadora, Reproductor {
    override fun playRecorder() {
        println("Puso a grabar el cassette $name - $author")
    }

    override fun stopRecorder() {
        println("Detuvo la grabacion del cassette $name")
    }

    override fun play() {
        println("Puso play la reproduccion del cassette $name - $author")
    }

    override fun stop() {
        println("Detuvo el cassette $name")
    }

}