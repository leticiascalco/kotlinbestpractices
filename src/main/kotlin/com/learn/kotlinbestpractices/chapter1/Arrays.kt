package com.learn.kotlinbestpractices.chapter1

class Arrays {

    fun testArrays(){
        val musketeers: Array<String> = arrayOf("Athos", "Porthos", "Aramis")

        //convertendo uma lista em Array
        listOf(1, 2, 3, 5).toTypedArray()

    }

    fun main(args: Array<String>) {
        println(args.joinToString(", "))
    }
}