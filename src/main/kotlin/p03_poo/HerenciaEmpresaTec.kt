package org.example.p03_poo

open class EmpleadoE(val departamento: String) {
    open val puesto = "Empleado general"
    val horario = "9:00 a 17:00"
    open fun trabajar(tarea: String) {
        println("👨🏻‍🦰$puesto hace la tarea $tarea en $departamento")
    }
}

class Programador(departamento: String) :
    EmpleadoE(departamento) {
    override val puesto = "Programador"

    override fun trabajar(tarea: String) {
        println("El programador está codificando $tarea")
        super.trabajar(tarea)
        println("Horario base: ${super.horario}")
    }
}

class Gerente(departamento: String) :
    EmpleadoE(departamento) {
    override val puesto = "Gerente"

    override fun trabajar(tarea: String) {
        println("Coordina y está supervisando $tarea")
        super.trabajar(tarea)
        println("Horario base: ${super.horario}")
    }
}

fun main() {
    val ana = Programador("Desarrollo")
    println("Puesto: ${ana.puesto}")
    ana.trabajar("módulo de autenticación")

    println("-".repeat(100))
    val laura = Gerente("Finanzas")
    println("Puesto: ${laura.puesto}")
    laura.trabajar("generación de gráficas")
}