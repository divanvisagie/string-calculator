package com.divanvisagie.example

import tornadofx.Controller


class CalculationController : Controller() {
    val calculator = Calculator()


    fun calculate(inputValue: String, output: TextOutputControl) {
        println("Writing $inputValue to database!")
        val answer = calculator.add(inputValue).toString()

        output.setText("Adding $inputValue results in: $answer")
    }

    fun setDelimiter(selected: String) {
        calculator.setDelimiter(selected)
    }
}