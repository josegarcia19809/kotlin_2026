package org.example.p03_poo

class Empleado(
    val nombre: String, val identificacion: Int,
    val departamento: String, val puesto: String
) {

    fun obtenerDatos(): String {
        return "Nombre: $nombre, id: $identificacion, " +
                "departamento: $departamento, puesto: $puesto"
    }
}

fun main() {
    val empleado1 = Empleado("Susana Reyes", 47899, "contabilidad", "Vicepresidente")
    val empleado2 = Empleado("Marcos Juárez", 39119, "TI", "Programador")
    val empleado3 = Empleado("Felix Moreno", 81774, "fabricación", "Ingeniero")

    println(empleado1.obtenerDatos())
    println(empleado2.obtenerDatos())
    println(empleado3.obtenerDatos())

}