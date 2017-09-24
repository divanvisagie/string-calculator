package com.divanvisagie.example

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import tornadofx.*

interface TextOutputControl {
    fun setText(text: String)
}

class MyView: View() {
    val controller: CalculationController by inject()

    fun createCalculatorInputBox(output: TextOutputControl): HBox {

        val labelPadding = Insets(5.0,5.0,5.0,5.0)

        val calculatorInputBox = hbox {
            val addLabel = label("Add this stuff:")
            addLabel.padding = Insets(5.0,5.0,5.0,5.0)
            val inputField = textfield()
            button("Add") {
                action {
                    controller.calculate(inputField.text, output)
                    inputField.clear()
                }
            }
        }
        val marginSize = 10.0
        calculatorInputBox.padding = Insets(marginSize,marginSize,marginSize,marginSize)
        return calculatorInputBox
    }

    override val root = VBox()

    init {
        val outputControl = OutputControlBox()

        with(root) {
            this += createCalculatorInputBox(outputControl)
            this += outputControl.hbox
        }
    }


}
class MyApp: App(MyView::class)



fun main(args: Array<String>) {
    println("Hello World")
    Application.launch(MyApp::class.java, *args)
}