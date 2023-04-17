package polimorfismo



// Clase base (superclase)
open class Animal(val nombre: String) {

    open val pepe = ""

    open fun doSound() {
        println("El animal $nombre hace un sonido.")
    }
}