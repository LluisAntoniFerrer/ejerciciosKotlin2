package Actividad4.controlador

class Actividad4 {

 fun main(){
     fun Int.hasta(fin: Int) {
         for(i in this..fin){
             println(i);
         }
     }
     fun String.imprimir(fin: String){
         for(i in this){
             println(i);
         }
     }

     println("Escribe un numero para empezar");
     var desde = readLine()!!.toInt();
     println("Escribe un numero para acabar");
     var hasta = readLine()!!.toInt();
     desde.hasta(hasta);
     println("Dime una palabra");
     var palabra = readLine().toString();
     palabra.imprimir(palabra);
 }
}