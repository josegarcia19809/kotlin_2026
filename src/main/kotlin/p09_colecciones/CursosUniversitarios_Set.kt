package org.example.p09_colecciones

fun main() {

    mostrarTitulo()

    registrarCursos()

    eliminarCurso()

    calcularPromedioAlumnos()

    mostrarCursosDisponibles()

    administrarCursos()
}

//------------------------------------------------------
// Muestra el encabezado del programa.
//------------------------------------------------------
fun mostrarTitulo() {

    println("========================================")
    println(" SISTEMA DE CURSOS UNIVERSITARIOS")
    println("========================================")
}

//------------------------------------------------------
// Agrega cursos utilizando plus().
//------------------------------------------------------
fun registrarCursos() {

    val grupos = setOf(
        25,
        30,
        28,
        32,
        20,
        18
    )

    println("\n===== REGISTRAR NUEVO GRUPO =====")

    println("Grupos existentes:")
    println(grupos)

    println("\nAgregando un grupo con 35 alumnos:")

    val nuevosGrupos = grupos.plus(35)

    println(nuevosGrupos)

    println("\nIntentando agregar nuevamente un grupo con 30 alumnos:")

    println(grupos.plus(30))
}

//------------------------------------------------------
// Elimina un grupo.
//------------------------------------------------------
fun eliminarCurso() {

    val grupos = setOf(
        25,
        30,
        28,
        32,
        20,
        18
    )

    println("\n===== ELIMINAR GRUPO =====")

    println("Eliminando el grupo con 28 alumnos:")

    println(grupos.minus(28))

    println("\nIntentando eliminar un grupo inexistente:")

    println(grupos.minus(100))
}

//------------------------------------------------------
// Calcula el promedio de alumnos.
//------------------------------------------------------
fun calcularPromedioAlumnos() {

    val grupos = setOf(
        25,
        30,
        28,
        32,
        20,
        18
    )

    println("\n===== PROMEDIO DE ALUMNOS =====")

    println("Promedio: ${grupos.average()} alumnos")
}

//------------------------------------------------------
// Omite los primeros elementos.
//------------------------------------------------------
fun mostrarCursosDisponibles() {

    val grupos = setOf(
        25,
        30,
        28,
        32,
        20,
        18
    )

    println("\n===== CONSULTA DE GRUPOS =====")

    println("Grupos registrados:")
    println(grupos)

    println("\nDespués de aplicar drop(3):")
    println(grupos.drop(3))
}

//------------------------------------------------------
// Trabaja con MutableSet.
//------------------------------------------------------
fun administrarCursos() {

    val cursos = mutableSetOf(
        "Programación I",
        "Base de Datos",
        "Redes"
    )

    println("\n===== ADMINISTRAR CURSOS =====")

    println("Cursos actuales:")
    println(cursos)

    println("\nAgregando Inteligencia Artificial...")

    cursos.add("Inteligencia Artificial")

    println(cursos)

    println("\nIntentando agregar nuevamente Programación I...")

    cursos.add("Programación I")

    println(cursos)

    println("\nEliminando Redes...")

    cursos.remove("Redes")

    println(cursos)

    println("\nUtilizando plus()...")

    val nuevosCursos = cursos.plus("Ciberseguridad")

    println("Nuevo conjunto:")
    println(nuevosCursos)

    println("\nConjunto original:")
    println(cursos)
}