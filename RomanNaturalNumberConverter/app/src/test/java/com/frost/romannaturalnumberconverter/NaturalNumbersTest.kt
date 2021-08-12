package com.frost.romannaturalnumberconverter

import junit.framework.TestCase.assertEquals
import org.junit.Test

class NaturalNumbersTest {

    private val naturalNumbers = NaturalNumbers()

    @Test
    fun pasar1ANatural(){
        val natural = naturalNumbers.convertToNatural("I")
        assertEquals(natural, 1)
    }

    @Test
    fun pasar2ANatural(){
        val natural = naturalNumbers.convertToNatural("II")
        assertEquals(natural, 2)
    }

    @Test
    fun pasar3ANatural(){
        val natural = naturalNumbers.convertToNatural("III")
        assertEquals(natural, 3)
    }

    @Test
    fun pasar4ANatural(){
        val natural = naturalNumbers.convertToNatural("IV")
        assertEquals(natural, 4)
    }

    @Test
    fun pasar5ANatural(){
        val natural = naturalNumbers.convertToNatural("V")
        assertEquals(natural, 5)
    }

    @Test
    fun pasar6ANatural(){
        val natural = naturalNumbers.convertToNatural("VI")
        assertEquals(natural, 6)
    }

    @Test
    fun pasar7ANatural(){
        val natural = naturalNumbers.convertToNatural("VII")
        assertEquals(natural, 7)
    }

    @Test
    fun pasar8ANatural(){
        val natural = naturalNumbers.convertToNatural("VIII")
        assertEquals(natural, 8)
    }

    @Test
    fun pasar9ANatural(){
        val natural = naturalNumbers.convertToNatural("IX")
        assertEquals(natural, 9)
    }

    @Test
    fun pasar10ANatural(){
        val natural = naturalNumbers.convertToNatural("X")
        assertEquals(natural, 10)
    }

    @Test
    fun pasar11ANatural(){
        val natural = naturalNumbers.convertToNatural("XI")
        assertEquals(natural, 11)
    }

    @Test
    fun pasar12ANatural(){
        val natural = naturalNumbers.convertToNatural("XII")
        assertEquals(natural, 12)
    }

    @Test
    fun pasar13ANatural(){
        val natural = naturalNumbers.convertToNatural("XIII")
        assertEquals(natural, 13)
    }

    @Test
    fun pasar14ANatural(){
        val natural = naturalNumbers.convertToNatural("XIV")
        assertEquals(natural, 14)
    }

    @Test
    fun pasar15ANatural(){
        val natural = naturalNumbers.convertToNatural("XV")
        assertEquals(natural, 15)
    }

    @Test
    fun pasar16ANatural(){
        val natural = naturalNumbers.convertToNatural("XVI")
        assertEquals(natural, 16)
    }

    @Test
    fun pasar17ANatural(){
        val natural = naturalNumbers.convertToNatural("XVII")
        assertEquals(natural, 17)
    }

    @Test
    fun pasar18ANatural(){
        val natural = naturalNumbers.convertToNatural("XVIII")
        assertEquals(natural, 18)
    }

    @Test
    fun pasar19ANatural(){
        val natural = naturalNumbers.convertToNatural("XIX")
        assertEquals(natural, 19)
    }

    @Test
    fun pasar20ANatural(){
        val natural = naturalNumbers.convertToNatural("XX")
        assertEquals(natural, 20)
    }

    @Test
    fun verificarVeintenaNumerosNaturales(){
        val numerosNaturales = listOf(20, 21, 22, 23, 24, 25, 26, 27, 28, 29 )
        val listaAValidar = listOf("XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX")
        val numerosRomanos= listaAValidar.map { number -> naturalNumbers.convertToNatural(number) }

        assertEquals(numerosRomanos[0], numerosNaturales[0])
        assertEquals(numerosRomanos[1], numerosNaturales[1])
        assertEquals(numerosRomanos[2], numerosNaturales[2])
        assertEquals(numerosRomanos[3], numerosNaturales[3])
        assertEquals(numerosRomanos[4], numerosNaturales[4])
        assertEquals(numerosRomanos[5], numerosNaturales[5])
        assertEquals(numerosRomanos[6], numerosNaturales[6])
        assertEquals(numerosRomanos[7], numerosNaturales[7])
        assertEquals(numerosRomanos[8], numerosNaturales[8])
        assertEquals(numerosRomanos[9], numerosNaturales[9])
    }

    @Test
    fun verificarTreintenaNumerosNaturales(){
        val numerosNaturales = listOf(30, 31, 32, 33, 34, 35, 36, 37, 38, 39 )
        val listaAValidar = listOf("XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX")
        val numerosRomanos= listaAValidar.map { number -> naturalNumbers.convertToNatural(number) }

        assertEquals(numerosRomanos[0], numerosNaturales[0])
        assertEquals(numerosRomanos[1], numerosNaturales[1])
        assertEquals(numerosRomanos[2], numerosNaturales[2])
        assertEquals(numerosRomanos[3], numerosNaturales[3])
        assertEquals(numerosRomanos[4], numerosNaturales[4])
        assertEquals(numerosRomanos[5], numerosNaturales[5])
        assertEquals(numerosRomanos[6], numerosNaturales[6])
        assertEquals(numerosRomanos[7], numerosNaturales[7])
        assertEquals(numerosRomanos[8], numerosNaturales[8])
        assertEquals(numerosRomanos[9], numerosNaturales[9])
    }

    @Test
    fun verificarDecimalesNaturales(){
        val numerosNaturales = listOf(40, 50, 60, 70, 80, 90, 88, 67)
        val listaAValidar = listOf("XL", "L", "LX", "LXX", "LXXX", "XC", "LXXXVIII", "LXVII")
        val numerosRomanos= listaAValidar.map { number -> naturalNumbers.convertToNatural(number) }

        assertEquals(numerosRomanos[0], numerosNaturales[0])
        assertEquals(numerosRomanos[1], numerosNaturales[1])
        assertEquals(numerosRomanos[2], numerosNaturales[2])
        assertEquals(numerosRomanos[3], numerosNaturales[3])
        assertEquals(numerosRomanos[4], numerosNaturales[4])
        assertEquals(numerosRomanos[5], numerosNaturales[5])
        assertEquals(numerosRomanos[6], numerosNaturales[6])
        assertEquals(numerosRomanos[7], numerosNaturales[7])
    }

    @Test
    fun verificarNaturales() {
        val numerosNaturales = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234)
        val listaAValidar =
            listOf("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "MMMCCXXXIV")
        val numerosRomanos = listaAValidar.map { number -> naturalNumbers.convertToNatural(number) }

        assertEquals(numerosRomanos[0], numerosNaturales[0])
        assertEquals(numerosRomanos[1], numerosNaturales[1])
        assertEquals(numerosRomanos[2], numerosNaturales[2])
        assertEquals(numerosRomanos[3], numerosNaturales[3])
        assertEquals(numerosRomanos[4], numerosNaturales[4])
        assertEquals(numerosRomanos[5], numerosNaturales[5])
        assertEquals(numerosRomanos[6], numerosNaturales[6])
        assertEquals(numerosRomanos[7], numerosNaturales[7])
        assertEquals(numerosRomanos[8], numerosNaturales[8])
        assertEquals(numerosRomanos[9], numerosNaturales[9])
    }

}