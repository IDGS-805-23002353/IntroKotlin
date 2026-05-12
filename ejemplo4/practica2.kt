fun main() {
    var x = 0
    var min = 0

    println("Inicializando...")

    do {
   
        println("Minuto $min - Carga %: $x")
        x += 15
        min++
        
       
    } while (x <= 100)

    println("Carga finalizada al 100%. Total de minutos: ${min - 1}")
}