package p06_archivos

// EscribirArchivoPedirAmigos

import java.io.File

fun main() {
    println("Programa para lista de amigos 🧔🏻‍♂️👩🏼👩🏻‍🦱")
    print("¿Cuántos amigos tienes? ")
    val numAmigos = readln().toInt()

    // Crear un ArrayList vacío
    val listaAmigos = arrayListOf<String>()

    for (i in 1..numAmigos) {
        print("Escribe el nombre de tu amigo #$i: ")
        val nombreAmigo = readln()

        listaAmigos.add(nombreAmigo)
    }

    val archivo = File("amigos_lista.txt")
    archivo.writeText(listaAmigos.joinToString("\n"))
    println("La lista de amigos se ha creado correctamente")
    println("Abre el archivo amigos_lista.txt")
}