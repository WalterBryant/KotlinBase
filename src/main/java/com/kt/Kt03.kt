package com.kt

/**
 * Kotlin语言的类型推断
 */

fun main() {
    // 提示：Explicitly given type is redundant here
    // String 被置灰  显示给定的类型在这里是多余的
    val info : String = "让生活简单美好"
    println(info)

    val age1: Int = 15
    val age = 15
    println(age)

    val xChar = 'A'
}