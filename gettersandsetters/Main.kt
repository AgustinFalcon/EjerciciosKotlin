package gettersandsetters

import java.lang.Exception
import java.time.LocalDate
import java.time.Month


fun main() {
    println("")

    val user = User("AGUSTIN.FALCON@MOBILENIK.COM", "abc")

    val userRegistered: User? = RegisterUser().invoke(user = user)


    /*try {
          userRegistered =

    } catch (e: Exception) {
        e.printStackTrace()
    }*/


    if (userRegistered != null) {
        println("User Registered: ${userRegistered.email}")
        println("User Registered: ${userRegistered.password}")
    } else {
        println("User not Registered")
    }

    println("")
    val user2 = User(
        email = "USER2@USER2.COM",
        password = "123abc",
        birthdate = LocalDate.of(2023, Month.APRIL, 14),
        gender = 'M'
    )


    val user2Registered = RegisterUser().invoke(user = user2)
    if (user2Registered != null) {
        println("User2 Registered: ${user2Registered.email}")
        println("User2 Registered: ${user2Registered.password}")
        println("User2 Registered: ${user2Registered.birthdate}")
        println("User2 Registered: ${user2Registered.gender}")
    } else {
        println("User Not Registered")
    }
}