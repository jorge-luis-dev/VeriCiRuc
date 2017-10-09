package com.documento

/**
 * Created by jorgequiguango on 10/8/17.
 */
class Ci(val ci : String){
    var error :  String = ""

    fun validar() : Boolean {
        if (!basica(10))
            return false
        if (!provincia())
            return false
        if (!modulo10())
            return false
        return true
    }

    /**
    Función que verifica si son los digitos correctos
     */
    fun basica(dijitos : Int) : Boolean {
        if(isNumeric(ci)){
            val l = ci.length
            println("Longitud de cadena: $l")
            if (l == dijitos)
                return true
        }
        error = "El número de díjitos es de 10 para la Cédula y 13 para el RUC"
        return false
    }
    /**
    Función que identifica si es un número
     */
    fun isNumeric(input : String) : Boolean {
        try {
            input.toLong()
            return true
        } catch (e: NumberFormatException) {
            return false
        }
    }
    /**
    Función que verifica la provincia
     */
    fun provincia() : Boolean {
        val p = ci.substring(0,2).toInt()

        if (p == 30 || (p > 0 && p <= 24)) {
            println("Provincia: $p")
            return true
        }
        error = "La provincia no corresponde, debe comenzar entre 1 y 24 o 30"
        return false
    }
    fun modulo10() : Boolean {
        val dijitos = ci.substring(0,9).toCharArray()
        val verificador = ci.substring(9,10).toInt()
        val multiplicadores : IntArray = intArrayOf(2,1,2,1,2,1,2,1,2)
        var valor : Int
        var total : Int = 0
        val residuo : Int
        val resultado : Int

        println("Verificador: ${verificador}")

        for (i in dijitos.indices){
            val multiplicador = multiplicadores[i]
            val dijito  = dijitos[i].toString().toInt()
            valor = multiplicador*dijito

            if (valor >= 10)
                valor = valor.toString().substring(0,1).toInt() + valor.toString().substring(1,2).toInt()

            println("Multiplicador:  ${multiplicador} * Díjito: ${dijitos[i]} = $valor")

            total = total + valor
        }
        println("Total = $total")

        residuo = total % 10

        println("Residuo = $residuo")

        if (residuo == 0)
            resultado = 0
        else
            resultado = 10 - residuo

        if (resultado == verificador)
            println("Resultado = $resultado")
            return true

        error = "Los números no cumplen la validación del algoritomo módulo 10"
        return false
    }
}