package org.example.p03_poo.uso_funciones

// 🎨 Imprime los colores de varios autos
fun imprimirColores(vararg autos: Auto) {
    for (auto in autos) {
        println(auto.color)
    }
}

// 🧮 Multiplica dos números con etiqueta opcional
fun etiquetarMultiplicacion(
    operando1: Int, operando2: Int,
    etiqueta: String = "La respuesta es:"
) =
    "$etiqueta ${operando1 * operando2}"

// 🤷 Función simple de ejemplo
fun loQueSea() = 3 * 4