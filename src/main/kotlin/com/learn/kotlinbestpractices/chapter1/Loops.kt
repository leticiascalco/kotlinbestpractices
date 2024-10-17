package com.learn.kotlinbestpractices.chapter1

class Loops {

    fun testForeach(){

        for (c in "Word") {
            println(c)
        }

        //Usando lista:
        val jokers = listOf("Heath Ledger", "Joaquin Phoenix", "Jack Nicholson")
        for (j in jokers) {
            println(j)
        }
    }

    fun testFor(){
        for (i in 0..9) {
            println(i)
        }

        for (i in 0 until 10) { //infix calls
            println("for until $i")
            // Same output as the previous loop
        }

        for (i in 0 ..< 10) {
            println("for until $i")
            // Same output as the previous loop
        }

        //imprimindo na ordem inversa:
        for (i in 9 downTo 0) { //infix calls
            println("for downTo $i") // 9, 8, 7...
        }

        /**
         * Infix calls:
         * Uma chamada infixa permite que você chame uma função sem usar parênteses ou pontos, tornando o código
         * mais legível e expressivo. Essencialmente, você pode colocar a função entre os operandos, como se fosse
         * um operador. É por isso que until e downTo podem parecer operar como recursos de linguagem integrados,
         * mesmo que sejam apenas funções projetadas para serem usadas de forma infixa
         */
    }

    fun testWhile(){
        var x = 0 //precisa ser uma variável mutável
        while (x < 10) {
            x++
            println("while $x")
        }

        var x1 = 5 //precisa ser uma variável mutável
        do {
            println("do while $x1")
            x1--
        } while (x1 > 0)
    }
}