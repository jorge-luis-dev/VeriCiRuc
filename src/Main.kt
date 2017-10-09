import com.documento.Ci
import com.documento.Ruc

/**
 * Created by jorgequiguango on 10/8/17.
 */
fun main(args: Array<String>) {

    println("App para validar Cédula y RUC")
    println()

    val ci : Ci = Ci("1002810156")
    println("Cédula: ${ci.ci}")
    println(ci.validar())
    println("Error: ${ci.error}")

    println()

    val ruc1 : Ruc = Ruc("1002810156001")
    println("RUC: " + ruc1.ruc)
    println(ruc1.validar().toString() + " " + ruc1.tipo)
    println("Error: ${ruc1.error}")

    println()

    val ruc2 : Ruc = Ruc("1091707752001")
    println("RUC: " + ruc2.ruc)
    println(ruc2.validar().toString() + " " + ruc2.tipo)
    println("Error: ${ruc2.error}")
}