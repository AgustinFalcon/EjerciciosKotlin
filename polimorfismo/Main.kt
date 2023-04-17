package polimorfismo


fun main() {

    val dog: Animal = Dog("Firulais")
    val cat: Animal = Cat("Michi")

    dog.doSound() // Llama al método hacerSonido() de la clase Perro
    cat.doSound() // Llama al método hacerSonido() de la clase Gato

}