package p02_condicionales

fun main() {
    println("Producción de la fábrica 🏭")
    val piezasPorHora = 120

    print("¿Cuántas horas trabajó la máquina? ")
    val numHoras = readln().toInt()
    // val numHoras = 12

    val piezasProducidas = piezasPorHora * numHoras
    println("Piezas producidas: $piezasProducidas")

    if (piezasProducidas < 1000){
        println("Producción normal")
    }
    else{
        println("Producción alta")
    }
}