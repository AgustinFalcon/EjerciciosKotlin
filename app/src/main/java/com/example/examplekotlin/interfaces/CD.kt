package com.example.examplekotlin.interfaces


class CD(val name: String): Grabadora, Reproductor {

    override fun playRecorder() {
        println("Puso a grabar $name")
    }

    override fun stopRecorder() {
        println("Detuvo la grabacion $name")
    }

    override fun play() {
        println("Puso a reproducir el cd $name")
    }

    override fun stop() {
        println("Detuvo el cd $name")
    }


}