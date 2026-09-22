package p12_exa

fun main() {
    for (numeroLista in 1..20) {
        println("-".repeat(50) + numeroLista)

        val nivelJugador = numeroLista + 5
        val experiencia = nivelJugador * 120
        val poderBase = (nivelJugador * 3) + 10
        val categoria = (nivelJugador % 4) + 1

        var multiplicador = 1.0
        var nombreCategoria = "Novato"

        if (categoria == 1) {
            multiplicador = 1.5
            nombreCategoria = "Guerrero"
        } else if (categoria == 2) {
            multiplicador = 1.25
            nombreCategoria = "Explorador"
        } else if (categoria == 3) {
            multiplicador = 2.0
            nombreCategoria = "Mago"
        } else if (categoria == 4) {
            multiplicador = 1.75
            nombreCategoria = "Arquero"
        }

        val puntosFinales = (experiencia + poderBase * 10) * multiplicador

        println("nombreCategoria: $nombreCategoria")
        println("puntosFinales: $puntosFinales")
        println("categoria: $categoria")

        val paginasIniciales = numeroLista * 10
        val paginasBase = paginasIniciales
        var totalPaginas = 0
        val diasLectura = 4

        val paginasDiarias = 2 * paginasBase

        for (dia in 1..diasLectura) {
            totalPaginas += paginasDiarias * dia
        }

        println("totalPaginas: $totalPaginas")
    }
}