package org.example.p05_funciones

fun siCalifica() {
    print("Si califica")
}

fun noCalifica() {
    print("No califica")
}

fun main() {
    println("Tarjeta de credito")

    print("Salario anual: ")
    val salario = readln().toDouble()

    print("Calificacion crediticia (del 1 al 10): ")
    val calificacionCrediticia = readln().toInt()

    if (salario >= 2000 && calificacionCrediticia >= 7) {
        siCalifica()
    } else {
        noCalifica()
    }
}