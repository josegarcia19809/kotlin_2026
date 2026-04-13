package org.example.p05_funciones

inline fun etiquetaMultiplicar(
    operando1: Int,
    operando2: Int,
    generarEtiqueta: (Int) -> String
): String {
    val resultado = operando1 * operando2
    return generarEtiqueta(resultado)
}
fun main() {
    val resultado = etiquetaMultiplicar(3, 4) { res ->
        "El resultado es: $res"
    }

    println(resultado)

    println(etiquetaMultiplicar(2, 5) {
        "Total: $it"
    })

    println(etiquetaMultiplicar(7, 3) {
        "Multiplicación = $it"
    })

}
