package com.tutorial.capsule

open class MyProfile {
    val idNum1 = 980101
    protected val idNum2 = 1122334
    protected var password = "qwer1234"
}

class FindPW : MyProfile() {
    fun idCheck(id1: Int, id2: Int) {
        if(id1 == idNum1 && id2 == idNum2) println("비밀번호: $password")
        else println("꺼져!")
    }
}

fun main() {
    val profile = MyProfile()
    // println(profile.password)        // 접근 불가...

    val findPW = FindPW()
    findPW.idCheck(980101, 1122334)
}

