package org.example.p01_fundamentos

fun main() {
    print("Ingresa tu contraseña: ")
    val password = readln()

    if (password == "1234") {
        println("🔓 Acceso permitido")
    } else {
        println("🔒 Contraseña incorrecta")
    }
}