import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.atanh
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

internal class CalculatorTest {

    //addition test cases
    @Test
    fun addPositiveTwoNumbers(){

        val a = 12
        val b = 4

        val output = Calculator().addTwoPositiveNumbers(a,b)

        kotlin.test.assertEquals(16, output)
    }

    @Test
    fun addOnePositiveAndOneNegativeNumbers(){

        val a = 12
        val b = -4

        val output = Calculator().addTwoPositiveNumbers(a,b)

        kotlin.test.assertEquals(8, output)
    }

    @Test
    fun addTwoNegativeNumbers(){

        val a = -12
        val b = -4

        val output = Calculator().addTwoPositiveNumbers(a,b)

        kotlin.test.assertEquals(-16, output)
    }

    //subtraction cases

    @Test
    fun subTwoPositiveNumbers(){
        val a = 12
        val b = 5

        val result = Calculator().subTwoPositiveNumbers(a, b)

        assertEquals(7, result)
    }

    @Test
    fun subOnePositiveAndNegativeNumbers(){
        val a = 12
        val b = -5

        val result = Calculator().subTwoPositiveNumbers(a, b)

        assertEquals(17, result)
    }

    @Test
    fun subTwoNegativeNumbers(){
        val a = -12
        val b = -5

        val result = Calculator().subTwoPositiveNumbers(a, b)

        assertEquals(-7, result)
    }



    //division test cases
    @Test
    fun divTwoPositiveNumbers(){
        val a = 12
        val b = 4

        val result = Calculator().divideTwoPositiveNumbers(a,b)

        assertEquals(3, result)
    }

    @Test
    fun divAPositiveAndNegativeNumbers(){
        val a = 12
        val b = -4

        val result = Calculator().divideTwoPositiveNumbers(a,b)

        assertEquals(-3, result)
    }

    @Test
    fun divTwoNegativeNumbers(){
        val a = -12
        val b = -4

        val result = Calculator().divideTwoPositiveNumbers(a,b)

        assertEquals(3, result)
    }

    // multiplication test cases
    @Test
    fun multiplyTwoPositiveNumbers(){
        val a = 12
        val b = 5

        val result = Calculator().multiplyTwoPositiveNumbers(a, b)

        assertEquals(60, result)
    }

    @Test
    fun multiplyAPositiveAndANegativeNumbers(){
        val a = -12
        val b = 5

        val result = Calculator().multiplyTwoPositiveNumbers(a, b)

        assertEquals(-60, result)
    }

    @Test
    fun multiplyTwoANegativeNumbers(){
        val a = -12
        val b = -5

        val result = Calculator().multiplyTwoPositiveNumbers(a, b)

        assertEquals(60, result)
    }



    @Test
    fun sinOfANumberInDegrees(){

        var a = 30.0
        val result = Calculator().sinOfAPositiveNumber(a)

        assertEquals(0.5, result)
    }

    @Test
    fun cosOfANumberInDegrees(){
        var a = 30.0
        val result = Calculator().cosOfAPositiveNumber(a)

        assertEquals(0.866, result)
    }

    @Test
    fun tanOfANumberInDegrees(){

        var a = 30.0

        val result = Calculator().tanOfAPositiveNumbers(a)

        assertEquals(0.577, result)
    }

    @Test

    fun returnTanInverseOfAPositiveNumber(){
        var a = 0.345

        var result = Calculator().tanInverseOfAPositiveNumber(a)

        assertEquals(19.034, result)
    }

    @Test
    fun returnSinInverseResultForADouble(){
        var a = 0.125
        var result = Calculator().sinInverseOfAPositiveNumber(a)

        assertEquals(7.181, result)
    }


    @Test
    fun returnCosInverseResultForADouble(){
        var a = 0.125
        var result = Calculator().cosInverseOfAPositiveNumber(a)

        assertEquals(82.82, result)
    }




}