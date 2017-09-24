package com.divanvisagie.example

import tornadofx.Controller

class CalculationController : Controller() {
    fun writeToDb(inputValue: String, output: TextOutputControl) {
        println("Writing $inputValue to database!")
        output.setText("I did stuff to " + inputValue)
    }
}