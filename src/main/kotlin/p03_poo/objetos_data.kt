package org.example.p03_poo

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println("=== 🚗 AUTOS ===")

    // Crear autos
    val auto1 = Car("rojo", "Nissan", 2020)
    val auto2 = Car("rojo", "Nissan", 2020)

    println(auto1)
    println(auto2)

    // Comparar autos
    if (auto1 == auto2) {
        println("Los autos son iguales ✅")
    } else {
        println("Los autos son diferentes ❌")
    }

    // Copiar auto
    val auto3 = auto1.copy()
    println("Copia del auto: $auto3")

    // Copiar modificando datos
    val auto4 = auto1.copy(year = 2024, color = "negro")
    println("Auto modificado: $auto4")

    println("\n=== 👨‍💼 EMPLEADOS ===")

    val empleado1 = Employee("Ana")
    val empleado2 = Employee("Ana")

    println(empleado1)
    println(empleado2)

    // Comparar empleados
    if (empleado1 == empleado2) {
        println("Los empleados son iguales ✅")
    } else {
        println("Los empleados son diferentes ❌")
    }

    // Usar getter y setter
    println("Estado actual:")
    println(empleado1.fullTime)

    println("Cambiando estado...")
    empleado1.fullTime = false

    println("Nuevo estado:")
    println(empleado1.fullTime)

    println("\n=== 🔢 CONSTANTE ===")
    println("Valor constante: $MY_CONSTANT")
}

// Data class
data class Car(val color: String, val model: String, val year: Int)

// Clase normal
class Employee(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
        get() {
            println("👉 Ejecutando GET")
            return field
        }
        set(value) {
            println("👉 Ejecutando SET")
            field = value
        }
}