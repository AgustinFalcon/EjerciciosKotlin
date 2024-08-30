package com.example.examplekotlin.interfaces



fun main() {

    val cassete = Cassette("Tengo la camisa negra", "Juanes")
    val cd = CD("Muerte")

    cassete.play()
    cassete.playRecorder()
    cd.play()
    cd.playRecorder()


    println()
    println()

    cassete.stop()
    cassete.stopRecorder()
    cd.stop()
    cd.stopRecorder()


}