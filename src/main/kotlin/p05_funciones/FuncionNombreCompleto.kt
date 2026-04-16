package org.example.p05_funciones

// Declarar una función que reciba 3 parámetros
// en este orden nombre, apellidoP, apellidoM
// La función debe imprimir el nombre completo, empezando por
// los apellidos


// mostrarNombreCompleto("José", "García", "Morales")
// debe imprimir: García Morales, José


fun mostrarNombreCompleto(
    nombre: String,
    apellidoP: String,
    apellidoM: String
) {
    println("$apellidoP $apellidoM, $nombre")
}

fun main() {
    mostrarNombreCompleto("Estefania", "Cruz", "Garcia")
}