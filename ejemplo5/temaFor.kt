/*
Definición de rangos
val unDigitos= 1..9
val letras ='a'...'z' 

val docena = 1..12

if (5 in docena)
    println("El numero 5 esta en el rango docena")

if (18! in docena)
    println("El numero 18 no esta en el rango docena")

*/

fun main()
{
    for (i in 1..10)
        println(i)

    for (i in 1..10 step 2)
        println(i)

    for (i in 10 downTo 1)
        println(i)
    
    for (i in 10 downTo 1 step 2)
        println(i)
    
}