package p05_funciones

// funcion_cuadrado

fun elevarAlCuadrado(n: Double): Double {
    return n * n
}

fun main() {
    println("Programa para calcular el cuadrado de un número")
    println(elevarAlCuadrado(5.0))
    println(elevarAlCuadrado(8.0))

    val resultado = elevarAlCuadrado(6.0)
    println(resultado)

    println("9.0 elevado al cuadrado: ${elevarAlCuadrado(9.0)}")
    println("6.0 elevado al cuadrado: $resultado")
}