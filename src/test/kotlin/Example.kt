package com.divanvisagie.example


import org.mockito.Mockito.*
import org.junit.Assert
import org.junit.Test


interface ICalculator {
    fun add(x: Int, y: Int): Int
}
class Calculator : ICalculator {
    override fun add(x: Int, y: Int): Int {
        return 0
    }
}



class KotlinJunitTest {

    @Test
    fun firstTest() {
        Assert.assertTrue(1 == 1)
    }

    @Test
    fun mockedAddTestShouldReturn2() {
        var calculator = mock(ICalculator::class.java)
        `when`(calculator.add(1,1)).thenReturn(2)

        val answer = calculator.add(1,1)
        Assert.assertEquals(2, answer)
    }


}