package org.example.p03_poo.uso_funciones

fun main() {

    // 🧮 Mostrar resultado de una multiplicación con etiqueta
    println(
        etiquetarMultiplicacion(
            etiqueta = "Aquí está el resultado:",
            operando2 = 3, operando1 = 4
        )
    )

    // 👤 Crear empleado
    val empleado = Empleado("Jane")
    println(empleado.nombreEnMayusculas())

    // 🚗 Crear autos
    val auto1 = Auto("azul", "Toyota", 2015)
    val auto2 = Auto("rojo", "Ford", 2016)
    val auto3 = Auto("gris", "Ford", 2017)

    // 🎨 Imprimir colores
    imprimirColores(auto1, auto2, auto3)

    // 🔢 Arreglo de números
    val numeros = arrayOf(1, 2, 3)

    // 🚗 Arreglo de autos
    val muchosAutos = arrayOf(auto1, auto2, auto3)

    // 📦 Uso del operador spread (*)
    imprimirColores(*muchosAutos)

    val masAutos = arrayOf(auto2, auto3)

    // 🔁 Copiar objeto
    val auto4 = auto2.copy()

    // 📚 Combinar arreglos
    val montonAutos = arrayOf(*muchosAutos, *masAutos, auto4)

    // 🔄 Recorrer autos
    for (auto in montonAutos) {
        println(auto)
    }
}