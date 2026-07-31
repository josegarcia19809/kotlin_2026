package org.example.p09_colecciones

fun main() {

    mostrarEncabezadoOperaciones()

    ordenarInventario()

    verificarExistencias()

    contarProductosRecientes()

    buscarProducto()

    agruparPorCategoria()

    ordenarPorPrecio()

    obtenerProductosMarca()

    obtenerPrecios()

    incrementarPrecios()
}

//-----------------------------------------------------
// Muestra el encabezado.
//-----------------------------------------------------
fun mostrarEncabezadoOperaciones() {

    println("========================================")
    println(" SISTEMA DE INVENTARIO DE TECNOLOGÍA")
    println("========================================")
}

//-----------------------------------------------------
// Ordena el inventario por clave.
//-----------------------------------------------------
fun ordenarInventario() {

    val inventario = obtenerInventario()

    println("\n===== INVENTARIO ORDENADO =====")
    println(inventario.toSortedMap())
}

//-----------------------------------------------------
// Verifica si existe un producto reciente.
//-----------------------------------------------------
fun verificarExistencias() {

    val inventario = obtenerInventario()

    println("\n===== PRODUCTOS RECIENTES =====")

    println(
        inventario.any {
            it.value.anio >= 2024
        }
    )
}

//-----------------------------------------------------
// Cuenta cuántos productos son recientes.
//-----------------------------------------------------
fun contarProductosRecientes() {

    val inventario = obtenerInventario()

    println("\n===== CANTIDAD DE PRODUCTOS RECIENTES =====")

    println(
        inventario.count {
            it.value.anio >= 2024
        }
    )
}

//-----------------------------------------------------
// Busca el primer producto reciente.
//-----------------------------------------------------
fun buscarProducto() {

    val inventario = obtenerInventario()

    val productos = inventario.values

    println("\n===== PRIMER PRODUCTO RECIENTE =====")

    println(
        productos.find {
            it.anio >= 2024
        }
    )
}

//-----------------------------------------------------
// Agrupa los productos por categoría.
//-----------------------------------------------------
fun agruparPorCategoria() {

    val inventario = obtenerInventario()

    val productos = inventario.values

    println("\n===== PRODUCTOS AGRUPADOS =====")

    println(
        productos.groupBy {
            it.categoria
        }
    )
}

//-----------------------------------------------------
// Ordena los productos por precio.
//-----------------------------------------------------
fun ordenarPorPrecio() {

    val inventario = obtenerInventario()

    val productos = inventario.values

    println("\n===== PRODUCTOS ORDENADOS POR PRECIO =====")

    println(
        productos.sortedBy {
            it.precio
        }
    )
}

//-----------------------------------------------------
// Filtra los productos de una marca y obtiene
// únicamente sus categorías.
//-----------------------------------------------------
fun obtenerProductosMarca() {

    val inventario = obtenerInventario()

    println("\n===== PRODUCTOS DE LA MARCA LENOVO =====")

    println(
        inventario
            .filter {
                it.value.marca == "Lenovo"
            }
            .map {
                it.value.categoria
            }
    )
}

//-----------------------------------------------------
// Obtiene únicamente los precios.
//-----------------------------------------------------
fun obtenerPrecios() {

    val inventario = obtenerInventario()

    println("\n===== PRECIOS =====")

    println(
        inventario.map {
            it.value.precio
        }
    )
}

//-----------------------------------------------------
// Utiliza map() para incrementar todos los precios.
//-----------------------------------------------------
fun incrementarPrecios() {

    val precios = arrayOf(
        15000,
        18000,
        9000,
        22000,
        12000
    )

    val nuevosPrecios = precios.map {

        it + 1000

    }

    println("\n===== PRECIOS ACTUALIZADOS =====")
    println(nuevosPrecios)
}

//-----------------------------------------------------
// Devuelve el inventario.
//-----------------------------------------------------
fun obtenerInventario(): Map<Int, Producto> {

    return mapOf(

        101 to Producto(
            "Laptop",
            "Lenovo",
            "Computación",
            2024,
            15000
        ),

        102 to Producto(
            "Monitor",
            "Samsung",
            "Pantallas",
            2023,
            18000
        ),

        103 to Producto(
            "Mouse",
            "Logitech",
            "Accesorios",
            2022,
            9000
        ),

        104 to Producto(
            "Laptop",
            "HP",
            "Computación",
            2025,
            22000
        ),

        105 to Producto(
            "Tablet",
            "Lenovo",
            "Dispositivos móviles",
            2024,
            12000
        )
    )
}

//-----------------------------------------------------
// Clase Producto.
//-----------------------------------------------------
data class Producto(

    val nombre: String,
    val marca: String,
    val categoria: String,
    val anio: Int,
    val precio: Int

)