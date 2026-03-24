package org.example.p03_poo.uso_funciones

// 👤 Representa un empleado
class Empleado(val nombre: String) {

    // 🔠 Convierte el nombre a mayúsculas
    fun nombreEnMayusculas() = nombre.uppercase()
}