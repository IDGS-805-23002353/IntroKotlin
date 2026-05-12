/* */

fun main(){
    var diametro:Int
  do{
       println("Ingresa el diámetro de una tubaría :")
        diametro = readln().toIntOrNull() ?: 0

        if (diametro !=0){
            println("Ingrese un diámetro válido")
        }
    }while(diametro <=0)
            println("El diámetro es: $diametro")
           
    }