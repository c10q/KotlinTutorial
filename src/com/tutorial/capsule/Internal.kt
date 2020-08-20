package com.tutorial.capsule

internal class Galaxy {
    internal val s10 = "Samsung Galaxy s10"
    val note10 = "Samsung Galaxy Note 10"
}

class BolSa {
    internal val galaxy = Galaxy()

    fun bolsa() {
        println("줄게 내 ${galaxy.s10}")
    }
}

fun main() {
    val g = Galaxy()
    println(g.note10)

    val b = BolSa()
    b.bolsa()
}