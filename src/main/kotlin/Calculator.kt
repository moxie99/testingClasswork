import kotlin.math.*

class Calculator {


    fun addTwoPositiveNumbers(a: Int, b:Int): Int
    {
        return (a + b)
    }

    fun subTwoPositiveNumbers(a: Int, b: Int): Int{
        return (a - b)
    }


    fun multiplyTwoPositiveNumbers(a: Int, b:Int): Int{
        return (a * b)
    }

    fun divideTwoPositiveNumbers(a: Int, b:Int): Int{
        return (a / b)
    }


    fun sinOfAPositiveNumber(a: Double): Double{
        var a = Math.toRadians(a)
        a = sin(a)

        var c = "%.3f".format(a)

        return c.toDouble()

    }

    fun cosOfAPositiveNumber(a: Double): Double{

        var a = Math.toRadians(30.0)
        a = cos(a)

        var c = "%.3f".format(a)

        return c.toDouble()
    }

    fun tanOfAPositiveNumbers(a: Double): Double
    {
        var a = Math.toRadians(a)
        a = tan(a)

        var c = "%.3f".format(a)

        return c.toDouble()
    }
    fun sinInverseOfAPositiveNumber(a: Double): Double
    {
        var a = Math.toRadians(a)
        a = sinh(a)

        var c = "%.3f".format(a)

        return c.toDouble()
    }

    fun cosInverseOfAPositiveNumber(a:Double): Double{
        var a = Math.toRadians(a)
        a = cosh(a)

        var c = "%.3f".format(a)

        return c.toDouble()
    }

    fun tanInverseOfAPositiveNumber(a:Double):Double
    {
        var a = Math.toRadians(a)
        a = tanh(a)

        var c = "%.3f".format(a)

        return c.toDouble()
    }

}