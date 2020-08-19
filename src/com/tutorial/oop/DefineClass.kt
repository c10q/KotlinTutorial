package com.tutorial.oop

class Champion {
    var name : String = "champ"

    val a = "평타"    //프로퍼티

    var q = "q skill"
    var w = "w skill"
    var e = "e skill"
    var u = "ultimate"

    fun combo (skill : Array<String>) {     // 메서드
        println("스킬 콤보: ")
        for (i in skill) {
            println(i)
        }
    }
}

fun main() {
    val c = Champion()  // 객체 c 생성, c는 Champion 클래스의 인스턴스

    c.name = "아트록스"

    c.q = "다르킨의 검"
    c.w = "지옥 사슬"
    c.e = "파멸의 돌진"
    c.u = "세계의 종결자"

    println("챔피언: ${c.name}")

    val command = arrayOf(c.u ,c.q, c.e, c.w, c.q, c.a, c.q, c.e)
    c.combo(command)
}