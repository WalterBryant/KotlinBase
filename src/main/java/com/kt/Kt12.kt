package com.kt

/**
 * Kotlin语言的具名函数参数
 */

fun main() {
    loginAction(age = 15, userpwd = "123", usernam = "wb", username = "WuBa", phonenumber = "123456")
}

private fun loginAction(username: String, userpwd: String, phonenumber: String, age: Int, usernam: String) {
    println("username:$username, userpwd:$userpwd, phonenumber:$phonenumber, age:$age")
}