package com.divanvisagie.example

import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import tornadofx.action
import tornadofx.observable
import tornadofx.plusAssign
import tornadofx.selectedItem

class InputControlBox(controller: CalculationController, output: TextOutputControl) {

    var box = VBox()
    private val inputField = TextField()
    private val addButton = Button("Add")
    private val dropdown = ComboBox<String>()
    var delimiters = listOf(",","|").observable()

    init {
       val hbox = HBox()
       addButton.action {
           controller.calculate(inputField.text, output)
           inputField.clear()
       }
       addButton.padding = Insets(5.0, 5.0, 5.0, 5.0)
       box.padding = Insets(10.0, 10.0, 10.0, 10.0)
       box.spacing = 5.0

       hbox += inputField
       hbox += addButton
       box += hbox
       box += dropdown

       dropdown.items = delimiters
       dropdown.setOnAction { x ->
           val selected = dropdown.selectedItem
           println(selected)
           controller.setDelimiter(selected.toString())
       }
    }
}