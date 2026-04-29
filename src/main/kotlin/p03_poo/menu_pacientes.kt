package org.example.p03_poo

class Paciente(
    val id: Int, val nombre: String,
    val edad: Int, val padecimiento: String
) {

    fun mostrarDatos(): String {
        return "id: $id, nombre: $nombre, edad: $edad, " +
                "padecimiento: $padecimiento"
    }
}

fun menuPacientes() {
    println("\nMENÚ DE PACIENTES 👦🏻👧🏻 👨🏻‍⚕️🩺")
    println("1.- Añadir paciente➕")
    println("2.- Mostrar pacientes")
    println("3.- Buscar paciente🔎")
    println("4.- Editar paciente")
    println("5.- Borrar paciente❌")
    println("0.- Salir")
    print("Elige una opción: ")
}

fun agregarPaciente(listaPacientes: ArrayList<Paciente>) {
    print("Dame el id del paciente: ")
    val id = readln().toInt()

    print("Dame nombre: ")
    val nombre = readln()

    print("Dame edad: ")
    val edad = readln().toInt()

    print("Dime su padecimiento: ")
    val padecimiento = readln()

    val nuevoPaciente = Paciente(id, nombre, edad, padecimiento)
    listaPacientes.add(nuevoPaciente)
    println("El paciente ha sido agregado...😀")
    println()
}

fun mostrarPacientes(listaPacientes: ArrayList<Paciente>) {
    println("Lista de pacientes 🩺")
    for (paciente in listaPacientes) {
        println(paciente.mostrarDatos())
    }
}

fun buscarPaciente(listaPacientes: ArrayList<Paciente>) {
    print("Ingresa el nombre del paciente a buscar: ")
    val nombreBuscar = readln()

    var encontrado = false
    for (paciente in listaPacientes) {
        if (nombreBuscar.equals(paciente.nombre, ignoreCase = true)) {
            println("Encontrado")
            println(paciente.mostrarDatos())
            encontrado = true
        }
    }
    if (!encontrado) {
        println("No fue encontrado este paciente $nombreBuscar")
    }
}

fun borrarPaciente(listaPacientes: ArrayList<Paciente>) {
    print("Ingresa el nombre del paciente a borrar: ")
    val nombreBorrar = readln()

    val iterator = listaPacientes.iterator()
    while (iterator.hasNext()) {
        val paciente = iterator.next()
        if (paciente.nombre.equals(nombreBorrar, ignoreCase = true)) {
            iterator.remove()
            println("Paciente eliminado")
        }
    }
}

fun leerPacientes(listaPacientes: ArrayList<Paciente>) {
    val ana = Paciente(1, "Ana", 18, "gripe")
    val luis = Paciente(2, "Luis", 30, "tos")

    listaPacientes.add(ana)
    listaPacientes.add(luis)
}

fun main() {
    val listaPacientes = ArrayList<Paciente>()
    leerPacientes(listaPacientes)
    mostrarPacientes(listaPacientes)
    var opcion: Int

    do {
        menuPacientes()
        opcion = readln().toInt()
        when (opcion) {
            1 -> {
                agregarPaciente(listaPacientes)
            }

            2 -> {
                mostrarPacientes(listaPacientes)
            }

            3 -> {
                buscarPaciente(listaPacientes)
            }

            4 -> {
                // TODO: Editar
            }

            5 -> {
                borrarPaciente(listaPacientes)
            }

            0 -> {
                println("Saliendo...")
            }

            else -> {
                println("Opción no válida")
            }
        }
    } while (opcion != 0)
}

