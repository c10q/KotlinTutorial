package com.tutorial.capsule

private class StaffOnly {

    private val member : Array<String> = arrayOf("나르", "브라움")
    val message : String = "관계자외 출입금지"

    private fun secretCode() {
        println("나르!!")
    }

    fun access() {
        println(message)
    }
}

class Annie {
    //val staff = staffOnly()         // 객체 선언 불가능
}

private class Gnar {                // 클래스를 private로 선언하면 객체로 지정 가능
    val staff = StaffOnly()

    val message = staff.message     // 접근 가능
    //val member = staff.member       // 접근 불가능
}

fun main() {
    val staff = StaffOnly()         // 객체 생성 가능
    val gnar = Gnar()               // 객체 생성 가능
    val annie = Annie()             // 객체 생성 가능

    //staff.secretCode()              // 접근 불가능
    staff.access()                  // 접근 가능
}