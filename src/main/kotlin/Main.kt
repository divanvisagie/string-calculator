package com.divanvisagie.example

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import tornadofx.*

class MyController: Controller() {
    fun writeToDb(inputValue: String) {
        println("Writing $inputValue to database!")
    }
}

class MyView: View() {
    val controller: MyController by inject()

    fun createCalculatorInputBox(): HBox {


        val calculatorInputBox = hbox {
            val addLabel = label("Add this stuff:")
            addLabel.padding = Insets(5.0,5.0,5.0,5.0)
            val inputField = textfield()
            button("Add") {
                action {
                    controller.writeToDb(inputField.text)
                    inputField.clear()
                }
            }
        }
        val marginSize = 10.0
        calculatorInputBox.padding = Insets(marginSize,marginSize,marginSize,marginSize)




        return calculatorInputBox
    }
    var a = createCalculatorInputBox()

    override val root = VBox()




    init {
        with(root) {
            this += createCalculatorInputBox()
        }
    }


}
class MyApp: App(MyView::class)



fun main(args: Array<String>) {
    println("Hello World")
    Application.launch(MyApp::class.java, *args)
}