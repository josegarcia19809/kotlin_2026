package p03_poo.MascotasApp

fun main() {
    val mascota1 = Mascota("Luna", "Perro", 3)
    val mascota2 = Mascota("Milo", "Gato", 2)
    val mascota3 = Mascota("Max", "Perro", 4)
    val mascota4 = Mascota("Nina", "Gato", 1)

    // crear colección mascotas
    val mascotas = ArrayList<Mascota>()
    mascotas.add(mascota1)
    mascotas.add(mascota2)
    mascotas.add(mascota3)
    mascotas.add(mascota4)

    println("-".repeat(100))
    println("🐶 Mascotas")
    for (mascota in mascotas) {
        println(mascota.mostrarDatos())
    }
}