package p06_archivos

// ListaDeCompras

import java.io.File

fun main() {
    // Intentamos abrir el archivo compras.txt. Si no existe, lo creamos
    val nombreArchivo = "compras.txt"
    val archivo = File(nombreArchivo)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo $nombreArchivo creado")
    }

    val listaCompras: ArrayList<String> = archivo.readLines()
            as ArrayList<String>

    while (true) {
        println("🛒 Lista de compras")
        print("Escribe agregar, mostrar o salir: ")
        val accionusuario = readln().trim().lowercase()

        when (accionusuario) {
            "agregar" -> {
                print("Dame elemento a agregar a la lista de compras: ")
                val elemento = readln()
                listaCompras.add(elemento)
                println("El elemento $elemento se agregó a la lista de compras")
            }

            "mostrar" -> {
                println("Elementos de mi lista de compras")
                for ((indice, elemento) in listaCompras.withIndex()) {
                    println("${indice + 1}: ${elemento}")
                }
            }

            "salir" -> {
                archivo.writeText(listaCompras.joinToString("\n"))
                break
            }

            else -> {
                println("Hey, ingresa una opción válida")
            }
        }
    }
}