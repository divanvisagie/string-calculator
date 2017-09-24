package com.divanvisagie.example

import javafx.application.Application
import javafx.scene.layout.*
import tornadofx.*

interface TextOutputControl {
    fun setText(text: String)
}

class MyView: View() {
    val controller: CalculationController by inject()

    override val root = VBox()

    init {
        val outputControl = OutputControlBox()
        val inputControl = InputControlBox(controller, outputControl)

        with(root) {
            this += inputControl.box
            this += outputControl.box
        }
    }


}
class MyApp: App(MyView::class)



fun main(args: Array<String>) {
    println("Hello World")
    Application.launch(MyApp::class.java, *args)
}