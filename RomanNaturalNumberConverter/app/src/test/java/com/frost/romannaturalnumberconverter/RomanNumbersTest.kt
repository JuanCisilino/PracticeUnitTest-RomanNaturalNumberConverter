package com.frost.romannaturalnumberconverter

import junit.framework.TestCase.assertEquals
import org.junit.Test

class RomanNumbersTest {

    private val romanNumbers = RomanNumbers()

    @Test
    fun pasar1ARomanos(){
        val romano = romanNumbers.convertToRomans(1)
        assertEquals(romano, "I")
    }

    @Test
    fun pasar2ARomanos(){
        val romano = romanNumbers.convertToRomans(2)
        assertEquals(romano, "II")
    }

    @Test
    fun pasar3ARomanos(){
        val romano = romanNumbers.convertToRomans(3)
        assertEquals(romano, "III")
    }

    @Test
    fun pasar4ARomanos(){
        val romano = romanNumbers.convertToRomans(4)
        assertEquals(romano, "IV")
    }

    @Test
    fun pasar5ARomanos(){
        val romano = romanNumbers.convertToRomans(5)
        assertEquals(romano, "V")
    }

    @Test
    fun pasar6ARomanos(){
        val romano = romanNumbers.convertToRomans(6)
        assertEquals(romano, "VI")
    }

    @Test
    fun pasar7ARomanos(){
        val romano = romanNumbers.convertToRomans(7)
        assertEquals(romano, "VII")
    }

    @Test
    fun pasar8ARomanos(){
        val romano = romanNumbers.convertToRomans(8)
        assertEquals(romano, "VIII")
    }

    @Test
    fun pasar9ARomanos(){
        val romano = romanNumbers.convertToRomans(9)
        assertEquals(romano, "IX")
    }

    @Test
    fun pasar10ARomanos(){
        val romano = romanNumbers.convertToRomans(10)
        assertEquals(romano, "X")
    }

    @Test
    fun pasar11ARomanos(){
        val romano = romanNumbers.convertToRomans(11)
        assertEquals(romano, "XI")
    }

    @Test
    fun pasar12ARomanos(){
        val romano = romanNumbers.convertToRomans(12)
        assertEquals(romano, "XII")
    }

    @Test
    fun pasar13ARomanos(){
        val romano = romanNumbers.convertToRomans(13)
        assertEquals(romano, "XIII")
    }

    @Test
    fun pasar14ARomanos(){
        val romano = romanNumbers.convertToRomans(14)
        assertEquals(romano, "XIV")
    }

    @Test
    fun pasar15ARomanos(){
        val romano = romanNumbers.convertToRomans(15)
        assertEquals(romano, "XV")
    }

    @Test
    fun pasar16ARomanos(){
        val romano = romanNumbers.convertToRomans(16)
        assertEquals(romano, "XVI")
    }

    @Test
    fun pasar17ARomanos(){
        val romano = romanNumbers.convertToRomans(17)
        assertEquals(romano, "XVII")
    }

    @Test
    fun pasar18ARomanos(){
        val romano = romanNumbers.convertToRomans(18)
        assertEquals(romano, "XVIII")
    }

    @Test
    fun pasar19ARomanos(){
        val romano = romanNumbers.convertToRomans(19)
        assertEquals(romano, "XIX")
    }

    @Test
    fun pasar20ARomanos(){
        val romano = romanNumbers.convertToRomans(20)
        assertEquals(romano, "XX")
    }

    @Test
    fun verificarVeintenaNumeroRomanos(){
        val numerosNaturales = listOf(20, 21, 22, 23, 24, 25, 26, 27, 28, 29 )
        val numerosRomanos= numerosNaturales.map { number -> romanNumbers.convertToRomans(number) }

        assertEquals(numerosRomanos[0], "XX")
        assertEquals(numerosRomanos[1], "XXI")
        assertEquals(numerosRomanos[2], "XXII")
        assertEquals(numerosRomanos[3], "XXIII")
        assertEquals(numerosRomanos[4], "XXIV")
        assertEquals(numerosRomanos[5], "XXV")
        assertEquals(numerosRomanos[6], "XXVI")
        assertEquals(numerosRomanos[7], "XXVII")
        assertEquals(numerosRomanos[8], "XXVIII")
        assertEquals(numerosRomanos[9], "XXIX")
    }

    @Test
    fun verificarTreintenaNumeroRomanos(){
        val numerosNaturales = listOf(30, 31, 32, 33, 34, 35, 36, 37, 38, 39 )
        val numerosRomanos= numerosNaturales.map { number -> romanNumbers.convertToRomans(number) }

        assertEquals(numerosRomanos[0], "XXX")
        assertEquals(numerosRomanos[1], "XXXI")
        assertEquals(numerosRomanos[2], "XXXII")
        assertEquals(numerosRomanos[3], "XXXIII")
        assertEquals(numerosRomanos[4], "XXXIV")
        assertEquals(numerosRomanos[5], "XXXV")
        assertEquals(numerosRomanos[6], "XXXVI")
        assertEquals(numerosRomanos[7], "XXXVII")
        assertEquals(numerosRomanos[8], "XXXVIII")
        assertEquals(numerosRomanos[9], "XXXIX")
    }

    @Test
    fun verificarDecimalesRomanos(){
        val numerosNaturales = listOf(40, 50, 60, 70, 80, 90, 88, 67)
        val numerosRomanos= numerosNaturales.map { number -> romanNumbers.convertToRomans(number) }

        assertEquals(numerosRomanos[0], "XL")
        assertEquals(numerosRomanos[1], "L")
        assertEquals(numerosRomanos[2], "LX")
        assertEquals(numerosRomanos[3], "LXX")
        assertEquals(numerosRomanos[4], "LXXX")
        assertEquals(numerosRomanos[5], "XC")
        assertEquals(numerosRomanos[6], "LXXXVIII")
        assertEquals(numerosRomanos[7], "LXVII")
    }

    @Test
    fun verificarRomanos(){
        val numerosNaturales = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234)
        val numerosRomanos= numerosNaturales.map { number -> romanNumbers.convertToRomans(number) }

        assertEquals(numerosRomanos[0], "C")
        assertEquals(numerosRomanos[1], "CC")
        assertEquals(numerosRomanos[2], "CCC")
        assertEquals(numerosRomanos[3], "CD")
        assertEquals(numerosRomanos[4], "D")
        assertEquals(numerosRomanos[5], "DC")
        assertEquals(numerosRomanos[6], "DCC")
        assertEquals(numerosRomanos[7], "DCCC")
        assertEquals(numerosRomanos[8], "CM")
        assertEquals(numerosRomanos[9], "MMMCCXXXIV")
    }
}