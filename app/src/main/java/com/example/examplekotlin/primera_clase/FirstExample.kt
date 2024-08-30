package com.example.examplekotlin.primera_clase



fun main() {

    val song1 = Song("Billie Jean", "Michael Jackson")
    song1.play()


    val song2 = Song("Camisa Negra", "Juanez")
    song2.play()


    println()
    println()
    song1.stop()
    song2.stop()



}