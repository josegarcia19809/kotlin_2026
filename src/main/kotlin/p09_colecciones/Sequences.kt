package org.example.p09_colecciones
/*
Este archivo introduce el concepto de Sequences (Sequence) en Kotlin, cuyo objetivo es procesar
colecciones de forma perezosa (lazy evaluation). A diferencia de las listas, las operaciones
(map, filter, etc.) no se ejecutan inmediatamente, sino hasta que una operación terminal
(find, toList, first, count, etc.) necesita el resultado.

Un contexto adecuado es un Sistema de Registro de Aspirantes a una Universidad,
donde se procesan muchos registros y es conveniente evitar trabajo innecesario.
 */

fun main() {

    mostrarTituloSequences()
    procesarCarreras()
    buscarPrimerAspirante()
}

//-----------------------------------------------------
// Muestra el encabezado del programa.
//-----------------------------------------------------
fun mostrarTituloSequences() {

    println("========================================")
    println(" SISTEMA DE ASPIRANTES UNIVERSITARIOS")
    println("========================================")
}

//-----------------------------------------------------
// Convierte un Map en Sequence y procesa la
// información de forma perezosa.
//-----------------------------------------------------
fun procesarCarreras() {

    val aspirantes = obtenerAspirantes()

    println("\n===== ASPIRANTES DE INGENIERÍA =====")

    val resultado = aspirantes
        .asSequence()
        .filter {
            println("Filtrando ${it.value.nombre}")
            it.value.carrera == "Ingeniería"
        }
        .map {
            println("Mapeando ${it.value.nombre}")
            it.value.nombre
        }

    println(resultado)

    println("\nResultado final:")
    println(resultado.toList())
}

//-----------------------------------------------------
// Demuestra que Sequence ejecuta las operaciones
// únicamente cuando encuentra el elemento buscado.
//-----------------------------------------------------
fun buscarPrimerAspirante() {

    println("\n===== BÚSQUEDA DEL PRIMER ASPIRANTE =====")

    val nombre = listOf(
        "María",
        "Juan",
        "Pedro",
        "José",
        "Carlos"
    )

    val encontrado = nombre
        .asSequence()
        .map {
            println("Convirtiendo $it")
            it.uppercase()
        }
        .filter {
            println("Evaluando $it")
            it.startsWith("J")
        }
        .find {
            println("Buscando coincidencia en $it")
            it.endsWith("E")
        }

    println("\nResultado:")
    println(encontrado)
}

//-----------------------------------------------------
// Devuelve un mapa con los aspirantes.
//-----------------------------------------------------
fun obtenerAspirantes(): Map<Int, Aspirante> {

    return mapOf(

        1001 to Aspirante(
            "María",
            "Ingeniería"
        ),

        1002 to Aspirante(
            "Luis",
            "Derecho"
        ),

        1003 to Aspirante(
            "Pedro",
            "Ingeniería"
        ),

        1004 to Aspirante(
            "Sofía",
            "Arquitectura"
        ),

        1005 to Aspirante(
            "José",
            "Ingeniería"
        )

    )
}

//-----------------------------------------------------
// Clase Aspirante.
//-----------------------------------------------------
data class Aspirante(

    val nombre: String,
    val carrera: String

)