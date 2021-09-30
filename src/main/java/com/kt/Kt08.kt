package com.kt

/**
 * Kotlin语言的when表达式
 */

fun main() {
    val week = 0

    // Java的 if 语句
    // KT的 if 是表达式 有返回值的

    val info = when(week) {
        1 -> "今天星期一，非常忙碌的一天开会"
        2 -> "今天星期二，非常辛苦的写需求"
        3 -> "今天星期三，努力写Bug中"
        4 -> "今天星期四，发布版本到凌晨"
        5 -> "今天星期五，淡定喝茶，一个Bug改一天"
        6 -> "今天星期六，稍微加加班"
        7 -> "今天星期日，看剧中，游玩中"
        else -> {
            println("养猪去了，管它星期几")
        }
    }
    println(info) // void 关键字 无返回    用 Unit类代替了 java 的 void关键字
}