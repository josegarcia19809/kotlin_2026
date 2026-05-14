package org.example.p06_archivos

import java.io.File

fun main(args: Array<String>) {

    println("📘 Programa para buscar archivos Kotlin")

    val carpetaActual = File(".")

    println("\n🔍 Buscando archivos con extensión .kt...\n")

    carpetaActual.walkTopDown()
        .filter { archivo ->

            archivo.name.endsWith(".kt")

        }
        .forEach { archivo ->

            println("📄 ${archivo.path}")

        }

    println("\n✅ Búsqueda finalizada")
}