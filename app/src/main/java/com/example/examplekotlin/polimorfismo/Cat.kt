package com.example.examplekotlin.polimorfismo

class Cat(nombre: String): Animal(nombre) {

    override fun doSound() {
        println("El gato hace: !Miau!")
    }

}