package com.example.examplekotlin.primera_clase


class Song(
    // Atributos
    private val title: String,
    private val artist: String
) {


    // Metodos o Funciones
    fun play() {
        println("Playing $title - $artist")
    }


    fun stop() {
        println("Stopping $title")
    }

}