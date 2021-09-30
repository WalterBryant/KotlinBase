package com.kt

/**
 * Kotlin语言的只读变量
 */

fun main() {

    // var 默认提示：变量永远不会被修改，建议修改成 val == 不可改变的(只读)
    val info : String = "58部落"
    // info = "ABC" // 不能修改
    println(info)

    /*
      只读     变量名   类型   值
      val     age   : Int = 15
     */
    val age: Int = 15
    // age = 16 // 不能修改
    println(age)
}