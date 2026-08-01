package org.example.p10_genericos

/*
Este archivo trata el tema de la Contravarianza (Contravariance) en Kotlin mediante la palabra
clave in. Demuestra que un objeto que sabe trabajar con un tipo más general (Flower) también
puede utilizarse para trabajar con un tipo más específico (Rose o Daffodil). Esto es posible
porque el tipo genérico solo consume objetos, es decir, los recibe como parámetros y
no los devuelve.
 */

// Clase base para todos los empleados.
open class EmpleadoF(val nombre: String)

// Clases derivadas.
class Programador(nombre: String) : EmpleadoF(nombre)

class Diseñador(nombre: String) : EmpleadoF(nombre)

// Interfaz contravariante.
// Solo consume objetos de tipo T.
interface Instructor<in T> {

    // Capacita a un empleado.
    fun capacitar(empleado: T)
}

// Clase que administra un grupo de empleados.
class Curso<T : EmpleadoF>(
    private val participantes: List<T>,
    private val instructor: Instructor<T>
) {

    // Envía a un participante a recibir capacitación.
    fun iniciarCapacitacion(indice: Int) {
        instructor.capacitar(participantes[indice])
    }
}

// Función que crea un instructor general para cualquier empleado.
fun crearInstructorGeneral(): Instructor<EmpleadoF> {
    return object : Instructor<EmpleadoF> {
        override fun capacitar(empleado: EmpleadoF) {
            println("Capacitando a ${empleado.nombre}.")
        }
    }
}

// Función que organiza un curso para programadores.
fun ejecutarCursoProgramacion() {

    val instructor = crearInstructorGeneral()

    val programadores = listOf(
        Programador("Ana"),
        Programador("Luis"),
        Programador("Carlos")
    )

    val curso = Curso(programadores, instructor)

    curso.iniciarCapacitacion(1)
}

// Función que organiza un curso para diseñadores.
fun ejecutarCursoDiseno() {

    val instructor = crearInstructorGeneral()

    val diseñadores = listOf(
        Diseñador("María"),
        Diseñador("Sofía")
    )

    val curso = Curso(diseñadores, instructor)

    curso.iniciarCapacitacion(0)
}

fun main() {

    ejecutarCursoProgramacion()

    ejecutarCursoDiseno()
}
/*
¿Qué aprenderá el estudiante?
Comprender qué significa la contravarianza en Kotlin.
Utilizar in para indicar que un tipo genérico solo consume objetos (los recibe como parámetros).
Entender que un Instructor<Empleado> puede utilizarse donde se espera un Instructor<Programador>
o un Instructor<Diseñador>, porque sabe trabajar con cualquier empleado.
Comprender por qué una interfaz declarada con in T no puede devolver un objeto de tipo T; por
ello el método pick() aparece comentado en el ejemplo original.
 */