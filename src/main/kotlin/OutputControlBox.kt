package com.divanvisagie.example

import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import tornadofx.plusAssign

class OutputControlBox: TextOutputControl {

    private var label = Label()
    var hbox = HBox()

    override fun setText(text: String) {
        label.text = text
    }

    init {
        hbox += label
        hbox.padding = Insets(10.0,10.0,10.0,10.0)

        label.padding = Insets(5.0,5.0,5.0,5.0)
    }
}