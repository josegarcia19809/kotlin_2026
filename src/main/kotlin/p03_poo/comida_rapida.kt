package org.example.p03_poo

class Comida(
    val nombre: String, val tipo: String,
    val precio: Double
) {
    fun mostrarDatos(): String {
        return "Nombre: $nombre, tipo: $tipo, " +
                "precio: $$precio"
    }
}

fun main() {
    val comida1 = Comida("Taco", "Mex", 15.0)
    val comida2 = Comida("Hotdog", "Fast", 20.0)
    val comida3 = Comida("Pizza", "Ital", 30.0)
    val comida4 = Comida("Burger", "Fast", 25.0)

    val listaComidas = ArrayList<Comida>()
    listaComidas.add(comida1)
    listaComidas.add(comida2)
    listaComidas.add(comida3)
    listaComidas.add(comida4)

    for (comida in listaComidas){
        println(comida.mostrarDatos())
    }
}