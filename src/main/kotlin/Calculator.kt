package com.divanvisagie.example

class Calculator {

    fun separate(input: String): List<String> {
        val separator = Regex(",")
        return input.split(separator)
    }

    fun parseStrings(input: List<String>): List<Int> {
        return input.map { x-> x.toInt()}
    }

    fun add(input: String): Int {
        if (input.isEmpty()) return 0
        return parseStrings(separate(input)).reduce({ acc, i ->
            acc + i
        })
    }
}