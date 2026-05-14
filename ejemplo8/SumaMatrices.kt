/*
Suma de matices en Kotlin 3x3
Programa que permita al usuario ingresar por teclado los valores de dos matrices,
mostrando el resultado en pantalla

*/

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val filas = 3
    val columnas = 3

  
    val matrizA = leerMatriz("A", filas, columnas, reader)
    val matrizB = leerMatriz("B", filas, columnas, reader)

    val matrizSuma = Array(filas) { IntArray(columnas) }
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j]
        }
    }


    imprimirMatriz(matrizSuma)
}


fun leerMatriz(nombre: String, filas: Int, columnas: Int, reader: Scanner): Array<IntArray> {
    val matriz = Array(filas) { IntArray(columnas) }
    println("\n Ingresa los datos de la matriz $nombre")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Matriz $nombre [$i][$j]: ")
            matriz[i][j] = reader.nextInt()
        }
    }
    return matriz
}


fun imprimirMatriz(matriz: Array<IntArray>) {
    println("\n")
    println("El resultado de la matriz es:")

    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println() 
    }
}
