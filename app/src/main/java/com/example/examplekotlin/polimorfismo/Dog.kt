package com.example.examplekotlin.polimorfismo

class Dog(nombre: String) : Animal(nombre) {

    override fun doSound() {
        println("El perro hace: !Guaug!")
    }

}