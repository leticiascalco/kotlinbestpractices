package com.learn.kotlinbestpractices.chapter1

import kotlin.random.Random

class Interfaces

interface DiceRoller {
    fun rollDice(): Int
}

class Player : DiceRoller {
    override fun rollDice(): Int = Random.nextInt(0, 6)
}

interface DiceRoller2 {
    fun rollDice(): Int = Random.nextInt(0, 6)
}

class Player2 : DiceRoller2