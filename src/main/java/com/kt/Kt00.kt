package com.kt

/**
 * Kotlin 空检查
 */
fun main() {
    var name: String ? = null

    // ? 如果为空，? 后面的就不执行。
    name?.length

    // !! 不管为不为空，!! 后面的一定会执行。
    name!!.length

    //这个与 Java 的判空一致。
    if(name != null) {
        name.length
    }

}