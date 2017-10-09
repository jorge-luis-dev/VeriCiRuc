/**
 * Created by jorgequiguango on 10/8/17.
 */
fun main(args: Array<String>) {
    println("App para validar Cédula y RUC")

    val ci : Ci = Ci("1002456877")
    println(ci.validar())
    println("Error: ${ci.error}")
}