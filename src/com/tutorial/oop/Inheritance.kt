package com.tutorial.oop

open class Timo {
    val name = "티모"
}

class Voice : Timo() {
    fun dialogue() {
        println("$name 대위, 명을 받들겠습니다!")
    }
}

fun main() {
    val v = Voice()
    v.dialogue()
}