package com.frost.romannaturalnumberconverter

class RomanNumbers {

    private val romanSimbols = listOf("I", "V", "X", "L", "C", "D", "M")


    fun convertToRomans(naturalNumber : Int): String{

        val charNumber = naturalNumber.toString().toCharArray()
        var inc = 0
        var result = ""
        for (i in charNumber.indices.reversed()) {
            val romanNumber = generic(Character.getNumericValue(charNumber[i]), 0 + inc, 1 + inc, 2 + inc)
            result = romanNumber + result
            inc += 2
        }
        return result
    }

    private fun generic(decena: Int, x: Int, y: Int, z: Int): String? =
        when {
            decena <= 3 ->{add(1, decena, "", romanSimbols[x])}
            decena == 4 ->{romanSimbols[x] + romanSimbols[y]}
            decena <= 8 ->{add(6, decena, romanSimbols[y], romanSimbols[x])}
            decena == 9 ->{romanSimbols[x] + romanSimbols[z]}
            else -> null
        }

    private fun add(initNumber: Int, naturalNumber: Int, initRomanNumber: String, incRoman: String): String{
        var initRoman = initRomanNumber
        for (i in initNumber..naturalNumber) initRoman += incRoman
        return initRoman
    }

}