package polimorfismo



// Clase derivada (subclase)
class Cat(nombre: String) : Animal(nombre) {

    override fun doSound() {
        println("El gato hace: ¡Miau!")
    }
}