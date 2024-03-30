import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja =0.0
var dolaresEnCaja = 0.0
fun main(){

    println("Ingresa la tasa de cambio de dolar a pesos: $")
    tasaCambio= readln()!!.toDouble()

    println("Ingresa la cantidad de pesos para la apertura de caja: $")
    pesosEnCaja= readln()!!.toDouble()

    println("Ingresa la cantidad de dolares para la apertura en caja: $")
    dolaresEnCaja= readln()!!.toDouble()
    controlOperaciones()

}
fun controlOperaciones(){

    println("Ingresa la cantidad de dolares a cambiar: $")
    val dolaresACambiar = readln()!!.toDouble()

    dolaresEnCaja+= dolaresACambiar

    val pesosAEntregar = tasaCambio* dolaresACambiar

    pesosEnCaja -= pesosAEntregar
    val formato = "#,###.00"

    println("""
        
        ** Recibo **
        Pesos mexicanos a entregar: $${DecimalFormat(formato).format(pesosAEntregar)}
        
        Pesos en caja: $${DecimalFormat(formato).format(pesosEnCaja)}
        Dolares en caja: $${DecimalFormat(formato).format(dolaresEnCaja)}
        
        
    """.trimIndent())
    controlOperaciones()
}