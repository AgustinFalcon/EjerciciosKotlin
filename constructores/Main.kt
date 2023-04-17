package constructores

import java.time.LocalDateTime
import java.time.Month


fun main() {


    val post = Post(
        name = "Kotlin",
        author = "Agustin Falcón",
        date = LocalDateTime.of(
            2023,
            Month.APRIL,
            14,
            16,
            55
        )
    )


    println(post.publish())


    val claseKotlin = Post(
        name = "Desarrollo de aplicaciones moviles",
        author = "Agustin Falcón",
        date = LocalDateTime.of(
            2023,
            Month.APRIL,
            14,
            17,
            0
        ),
        content = "Lorem impsum dolor set",
        category = "Kotlin"
    )

    println(claseKotlin.publish())


}