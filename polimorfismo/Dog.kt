package polimorfismo



// Clase derivada (subclase)
class Dog(nombre: String): Animal(nombre) {

    override fun doSound() {
        println("El perro $nombre hace: ¡Guau!")
    }

}