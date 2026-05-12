import kotlin.math.pow

fun areaCuadrado(lado: Int): Int {
    return lado * lado
}

fun areaRectangulo(base: Int, altura: Int): Int {
    return base * altura
}

fun areaTriangulo(base: Int, altura: Int): Double {
    return (base * altura) / 2.0
}

fun areaHexagono(perimetro: Double, apotema: Double): Double {
    return (perimetro * apotema) / 2.0
}

fun limpiarPantalla() {
    try {
        ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
    } catch (e: Exception) {
        repeat(50) { println() }
    }
}

fun main() {
    var opcion: Int?

    do {
        // Limpiamos la pantalla al inicio de cada repetición
        limpiarPantalla()

        println("_______________________________")
        println("   Programa para calcular áreas")
        println("_______________________________")
        println("Elija una opción:")
        println("1. Cuadrado")
        println("2. Rectángulo")
        println("3. Triángulo")
        println("4. Hexágono")
        println("5. Salir")
        
        print("\nOpción: ")
        opcion = readln().toIntOrNull()

        when (opcion) {
            1 -> {
                print("Ingresa el lado: ")
                val l = readln().toIntOrNull() ?: 0
                println("Área del cuadrado: ${areaCuadrado(l)}")
            }
            2 -> {
                print("Ingresa la base: ")
                val b = readln().toIntOrNull() ?: 0
                print("Ingresa la altura: ")
                val h = readln().toIntOrNull() ?: 0
                println("Área del rectángulo: ${areaRectangulo(b, h)}")
            }
            3 -> {
                print("Ingresa la base: ")
                val b = readln().toIntOrNull() ?: 0
                print("Ingresa la altura: ")
                val h = readln().toIntOrNull() ?: 0
                println("Área del triángulo: ${areaTriangulo(b, h)}")
            }
            4 -> {
                print("Ingresa el perímetro total: ")
                val p = readln().toDoubleOrNull() ?: 0.0
                print("Ingresa la medida del apotema: ")
                val a = readln().toDoubleOrNull() ?: 0.0
                val resultado = areaHexagono(p, a)
                println("Área del hexágono: ${String.format("%.2f", resultado)}")
            }
            5 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción no válida, intenta de nuevo.")
            }
        }

        // Pausa para que el usuario pueda ver el resultado antes de limpiar pantalla
        if (opcion != 5) {
            println("\nPresiona Enter para continuar...")
            readln()
        }

    } while (opcion != 5)
}