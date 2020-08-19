package com.tutorial.oop

class Item {
    var name : String
    var ad : Int
    var armor : Int
    var passive : Array<String>

    constructor(_name: String, _ad: Int, _armor: Int, _passive: Array<String>) {
        name = _name
        ad = _ad
        armor = _armor
        passive = _passive
    }

    init {
        println("""
            그거 좋지! 적을 해치우기에 안성맞춤이거든!
            
        """.trimIndent())
    }

    fun itemInfo() {
        println("""
            이름: $name
            공격력: $ad
            방어력: $armor
        """.trimIndent())
        for (i in passive) {
            println(i)
        }
    }

}

fun main() {
    val ps: String = """
            |고유 지속 효과: 치명적인 피해를 입으면 4초 동안 경직에 걸린 다음 
            |기본 체력의 50%, 최대 마나의 30%를 회복합니다. 
            |(재사용 대기시간 300초)""".trimMargin()

    val i = Item("수호 천사", 45, 40, arrayOf(ps))

    i.itemInfo()
}