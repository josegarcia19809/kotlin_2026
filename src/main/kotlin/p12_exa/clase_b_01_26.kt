package p12_exa

fun main() {
    for (numeroLista in 21..39) {
        println("-".repeat(50) + numeroLista)
        val idVideojuego = numeroLista * 3
        val precioBase = idVideojuego * 25.0
        val unidades = (idVideojuego % 4) + 1
        val tipoJuego = (idVideojuego % 5) + 1

        var descuento = 0.0
        var nombreTipo = "Aventura"

        if (tipoJuego == 1) {
            descuento = 0.10
            nombreTipo = "Acción"
        } else if (tipoJuego == 2) {
            descuento = 0.15
            nombreTipo = "Estrategia"
        } else if (tipoJuego == 3) {
            descuento = 0.20
            nombreTipo = "Deportes"
        } else if (tipoJuego == 4) {
            descuento = 0.12
            nombreTipo = "RPG"
        } else if (tipoJuego == 5) {
            descuento = 0.08
            nombreTipo = "Simulación"
        }

        val subtotal = precioBase * unidades
        val descuentoAplicado = subtotal * descuento
        val totalCompra = subtotal - descuentoAplicado

        println("nombreTipo: $nombreTipo")
        println("tipoJuego: $tipoJuego")
        println("totalCompra: $totalCompra")

        val repeticionesIniciales = numeroLista * 5
        val repeticionesBase = repeticionesIniciales
        var totalRepeticiones = 0
        val semanasEntrenamiento = 4

        val incrementoSemanal = 3 * repeticionesBase

        for (semana in 1..semanasEntrenamiento) {
            totalRepeticiones += incrementoSemanal + semana
        }

        println("totalRepeticiones: $totalRepeticiones")
    }
}