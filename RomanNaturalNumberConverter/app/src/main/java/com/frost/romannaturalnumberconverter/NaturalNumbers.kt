package com.frost.romannaturalnumberconverter

class NaturalNumbers {

    private val romanHashMap: HashMap<Char, Int> = object : HashMap<Char, Int>(){
        init {
            put('I', 1)
            put('V', 5)
            put('X', 10)
            put('L', 50)
            put('C', 100)
            put('D', 500)
            put('M', 1000)
        }
    }

    fun convertToNatural(romanNumber: String): Int{
        var result = 0
        val length = romanNumber.length
        var i = 0
        while (i < length){
            if (i!=length -1 && romanHashMap[romanNumber[i]]!! < romanHashMap[romanNumber[i+1]]!!){
                result += romanHashMap[romanNumber[i+1]]!! - romanHashMap[romanNumber[i]]!!
                i++
            } else {
                result += romanHashMap[romanNumber[i]]!!
            }
            i++
        }
        return result
    }

}