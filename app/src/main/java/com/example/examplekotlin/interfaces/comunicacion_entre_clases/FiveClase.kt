package com.example.examplekotlin.interfaces.comunicacion_entre_clases


fun main() {
    val claseA = ClaseA()
    claseA.iniciarComunicacionB()
}
interface Comunicador {
    fun enviarMensaje(mensaje: String)
}
class ClaseA(): Comunicador {
    override fun enviarMensaje(mensaje: String) {
        println("ClaseA recibio: $mensaje")
    }
    fun iniciarComunicacionB() {
        val claseB = ClaseB(this)
        claseB.realizarAccion()
    }
}
class ClaseB(private val comunicador: Comunicador) {
    fun realizarAccion() {
        val mensaje = "¡Acción realizada en ClaseB!"
        comunicador.enviarMensaje(mensaje)
    }
}

