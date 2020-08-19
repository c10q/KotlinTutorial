package com.tutorial.oop

class Spell constructor(var name: String, var cooldown: Int, var desc: String) {

    fun spellInfo() {
        println("""
            |이름: $name
            |쿨타임: $cooldown
            |효과: $desc
        """.trimMargin())
    }
}

fun main() {
    val ignite: String = """
        |대상 적 챔피언을 불태워, 
        |5초에 걸쳐 70~410(챔피언 레벨에 따라 변동)의 고정 피해를 입히고 
        |그동안 적의 위치를 드러내며 고통스러운 상처를 적용합니다.
        |(고통스러운 상처는 회복 효과를 40% 감소시킵니다. 또한, 은신 중인 적은 위치가 드러나지 않습니다.)""".trimMargin()

    val s = Spell("점화", 180, ignite)

    s.spellInfo()
}