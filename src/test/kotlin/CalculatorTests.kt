package com.divanvisagie.example


import org.junit.Assert
import org.junit.Test


class CalculatorTests {

    @Test
    fun firstTest() {
        Assert.assertTrue(1 == 1)
    }

    @Test
    fun Add_Empty_Should_Return_0() {
        val calculator = Calculator()
        val answer = calculator.add("")
        Assert.assertEquals(0, answer)
    }

    @Test
    fun Add_1_and_1_Should_Return_2() {
        val calculator = Calculator()
        val answer = calculator.add("1,1")
        Assert.assertEquals(2, answer)
    }

    @Test
    fun Add_2_and_4_Should_Return_6() {
        val answer = Calculator().add("4,2")
        Assert.assertEquals(6, answer)
    }

}