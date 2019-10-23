package Actividad1;
fun main(){
    // Pruebas actividad 1
    var banco = Banco();
    var cuenta1 = banco.createAcount(1000);
    banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
    banco.deposit(cuenta1,5000);
    banco.withdrar(cuenta1, 500);
    banco.mostrar(banco.getBalance(cuenta1).toString(),"ln");
    cuenta1.toString();


}