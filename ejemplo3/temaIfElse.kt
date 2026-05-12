
fun main(){
    println("Ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if(sueldo > 300){
        println("Paga impuestos")
    }
    else 
        println("No paga impuestos")


/*

>, <, 
*/

val a = 3
val b = 5

val mayor = if(a > b) a else b
println("El número mayor entre $a y  $b es $mayor")

}
