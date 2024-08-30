package com.example.examplekotlin.herencia


fun main() {
    //val auto = Automovil("audi","a3", 2)
    //auto.conducir()


    val moto = Moto("Rouser", "Muchos", Cilindradas.MEDIA)
    val listOfBajaCC = mutableListOf<Moto>()
    listOfBajaCC.add(moto)


    println(listOfBajaCC.toString())

    when(moto.getCilidradas()) {
        Cilindradas.BAJA -> {
            println("No corras la carrera")
        }

        Cilindradas.MEDIA -> {
            println("Ponele un seguro buneo")
        }

        Cilindradas.ALTA -> {
            println("No vivas en arg")
        }

        else -> {
            println("No hay consejo")
        }
    }
}

