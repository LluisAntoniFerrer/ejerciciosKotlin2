package Actividad5.modelo

data class Dado(val valor: Int) {
    override fun toString(): String {
        var asteriscos = "";
        for(i in 1..valor){
            asteriscos += "*";
        }
        return asteriscos
    }
}