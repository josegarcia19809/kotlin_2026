package org.example.p05_funciones


fun main() {
    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    if (this.isEmpty()) return this

    val upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1).uppercase()
}

