package com.example.examplekotlin.polimorfismo

open class Animal(val nombre: String) {

    open fun doSound() {
        println("El animal $nombre hace un sonido.")
    }

}