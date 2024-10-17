package com.learn.kotlinbestpractices.chapter1

import java.util.*

fun Classes(){

    val player = PlayerImmutable("Ronaldo", "de Lima")

    val player2 = PlayerMutable()
    player2.name = "Neymar"
    player2.lastName = "Jr"

    val player3 = PlayerWithCustomGetter("Alex")
    println(player3.name) // Output: ALEX
}

class PlayerMutable {
    var name: String = ""
    var lastName: String = ""
}

class PlayerImmutable(
    val name: String,
    val lastName: String,
)

class Player3(val name: String) { //name faz parte do construtor primário e é imutável
    var score: Int = 0 //score nao faz parte e é mutável, ou seja, pode ser alterada posteriormente
}

class PlayerWithCustomSetter(val name: String) {
    var score: Int = 0
        set(value) {
            field = if (value >= 0) {
                value
            } else {
                0
            }
        }
}

class PlayerWithCustomGetter(name: String) {
    val name = name
        get() = field.uppercase(Locale.getDefault())
}