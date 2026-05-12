fun main() {
    val claveCorrecta = "contraseña"
    var claveIngresada: String
    var intentos = 3

    do {
        println("Ingresa la clave (Intentos restantes: $intentos):")
        claveIngresada = readln()

        if (claveIngresada != claveCorrecta) {
            intentos-- 
            if (intentos > 0) {
                println("Clave incorrecta. Inténtalo de nuevo.")
            } else {
                println("Has agotado todos los intentos.")
            }
        }
        

    } while (claveIngresada != claveCorrecta && intentos > 0)

    if (claveIngresada == claveCorrecta) {
        println("¡Acceso concedido!")
    } else {
        println("Acceso denegado.")
    }
}