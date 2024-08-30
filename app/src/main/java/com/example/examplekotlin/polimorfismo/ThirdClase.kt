package com.example.examplekotlin.polimorfismo


fun main() {

    val dog: Animal = Dog("Firulais")
    val cat: Animal = Cat("Michifus")


    dog.doSound() // Llama al método hacerSonido() de la clase Dog
    cat.doSound() // Llama al método hacerSonido() de la clase Cat

}
