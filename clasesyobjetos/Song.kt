package clasesyobjetos

import java.time.Duration

class Song (
    // Atributos
    var title: String,
    var artist: String
) {

    var duration: Long? = null

    constructor(
        title: String,
        artist: String,
        duration: Long
    ) : this(title, artist) {

        this.title = title
        this.artist = artist
        this.duration = duration
    }


    /*init {
        println("Song $title created")
    }*/

    // Funcionalidades
    fun play() {
        println("Playing $title - $artist")
    }


    fun stop() {
        println("Stopping $title")
    }



}