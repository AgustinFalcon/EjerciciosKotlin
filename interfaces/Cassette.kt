package interfaces



class Cassette : Grabadora, Reproductor {

    override fun playRecorder() {
        println("Iniciando la grabacion")
    }

    override fun stopRecorder() {
        println("Deteniendo la grabacion")
    }

    override fun play() {
        println("Reproduciendo el sonido")
    }

    override fun pause() {
        println("Deteniendo el sonido")
    }


}