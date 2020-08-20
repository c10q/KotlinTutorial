package com.tutorial.oop

open class LZ {
    open fun khan() = println("DRX khan")
    fun bdd() = println("DRX bdd")
}

interface T1 {
    fun khan() = println("T1 khan")
    fun faker() = println("T1 faker")
}

class LCK : LZ(), T1 {

    override fun khan() {
        println("LCK khan")
    }

    fun test() {
        khan()
        super<LZ>.khan()
        bdd()
        super<T1>.khan()
        faker()

    }
}

fun main() {
    val lck = LCK()
    lck.test()
}