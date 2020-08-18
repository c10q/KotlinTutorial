package com.tutorial.variable

fun main() {
    var level: Int = 29 // 변수, 자료형을 정해줄 수 있다.
    var wins = 4 // 자료형을 정해주지 않아도 추론해준다.
    val summonerName = "SKT T1 Bengi" // 값 못바꿈. 상수
    level ++
    wins ++

    println(
        "$level" + "레벨\n" + "승리: " + "$wins\n" + "소환사명: " + summonerName
    )
}