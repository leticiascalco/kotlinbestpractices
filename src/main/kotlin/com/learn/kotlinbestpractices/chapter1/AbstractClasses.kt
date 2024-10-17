package com.learn.kotlinbestpractices.chapter1

class AbstractClasses {
}

abstract class Moveable {
    private var x: Int = 0
    private var y: Int = 0
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}