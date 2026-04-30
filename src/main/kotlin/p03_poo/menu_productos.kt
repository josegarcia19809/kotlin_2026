package org.example.p03_poo

class ProductoCine(
    var id: Int,
    var nombre: String,
    var precio: Double,
    var cantidad: Int
) {
    fun mostrarDatos(): String {
        return "ID: $id, nombre: $nombre, precio: $precio, " +
                "cantidad: $cantidad"
    }
}

fun menuProductosCine() {
    println("-".repeat(100))
    println("Nombre: José Luis García 😀")
    println("🎥MENÚ DE PRODUCTOS CINE")
    println("1.- Agregar producto ➕")
    println("2.- Mostrar productos 🍰")
    println("3.- Buscar producto 🔎")
    println("4.- Editar producto ✏️")
    println("5.- Borrar producto ❌")
    println("0.- Salir 🚶🏻‍♂️")
    print("Elige tu opción: ")
}

fun agregarProducto(listaProductos: ArrayList<ProductoCine>) {
    print("Dame el id del producto: ")
    val id = readln().toInt()

    print("Dame el nombre: ")
    val nombre = readln()

    print("Dame el precio: ")
    val precio = readln().toDouble()

    print("Dame la cantidad: ")
    val cantidad = readln().toInt()

    val nuevoProducto = ProductoCine(
        id, nombre, precio,
        cantidad
    )
    listaProductos.add(nuevoProducto)
    println("Producto agregado 😋")

}

fun mostrarProductos(listaProductos: ArrayList<ProductoCine>) {
    println("Lista de productos")
    for (producto in listaProductos) {
        println(producto.mostrarDatos())
    }
    println()
}

fun editarProducto(listaProductos: ArrayList<ProductoCine>) {
    // TODO: editar
}

fun buscarProducto(listaProductos: ArrayList<ProductoCine>) {
    // TODO: buscar
}

fun borrarProducto(listaProductos: ArrayList<ProductoCine>) {
    // TODO: borrar
}

fun main() {
    val listaProductos = ArrayList<ProductoCine>()
    val producto1 = ProductoCine(1, "Palomitas", 60.0, 40)
    val producto2 = ProductoCine(2, "Refresco", 35.0, 50)
    val producto3 = ProductoCine(3, "Nachos", 70.0, 30)
    val producto4 = ProductoCine(4, "Dulces", 25.0, 60)

    listaProductos.add(producto1)
    listaProductos.add(producto2)
    listaProductos.add(producto3)
    listaProductos.add(producto4)

    mostrarProductos(listaProductos)

    var opcion: Int
    do {
        menuProductosCine()
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                agregarProducto(listaProductos)
            }

            2 -> {
                mostrarProductos(listaProductos)
            }

            3 -> {
                buscarProducto(listaProductos)
            }

            4 -> {
                editarProducto(listaProductos)
            }

            5 -> {
                borrarProducto(listaProductos)
            }

            0 -> {
                println("Saliendo...👋🏼")
            }

            else -> {
                println("Opción no válida 😠")
            }
        }
    } while (opcion != 0)
}