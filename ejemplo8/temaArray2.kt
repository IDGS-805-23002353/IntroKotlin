fun main(parametro: Array<String>){
    val alturas = FloatArray(5)
    var suma = 0f
    for(i in 0..alturas.size-1){
        print("Ingresa altura: ")
        alturas[i] = readln().toFloat()
        suma += alturas[i]

    }

    val promedio = suma / alturas.size
    println("Altura promedio $promedio")
    var altos = 0
    var bajos = 0

    for(i in 0..alturas.size-1)
        if (alturas[i] > promedio)
            altos++
        else
            bajos++
    println("Cantidad de personas más altas que el promedio: $altos")
    println("Cantidad de personas más bajos que el promedio: $bajos")

}