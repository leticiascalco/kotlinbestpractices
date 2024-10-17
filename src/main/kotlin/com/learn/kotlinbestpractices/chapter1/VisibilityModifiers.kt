package com.learn.kotlinbestpractices.chapter1

class VisibilityModifiers {


}

//Aqui está um exemplo de uma classe ActivePlayer
// estendendo a classe abstrata Moveable e implementando a interface DiceRoller:

open class ActivePlayer(name: String) : Moveable(), DiceRoller {
    override fun rollDice(): Int {
        TODO("Not yet implemented")
    }
}
