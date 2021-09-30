package com.kt

/**
 * Kotlin语言的函数头学习
 */

fun main() {
    method01(19, "Lucy")
}

// 函数默认都是public
// 其实Kotlin的函数，更规范，先有输入，再有输出
private fun method01(age: Int, name: String) : Int {
    println("你的姓名是:$name,你的年龄是:$age")
    return 200
}
