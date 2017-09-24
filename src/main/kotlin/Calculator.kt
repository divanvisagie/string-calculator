package com.divanvisagie.example

class Calculator {
    private var delimiter = ","

    fun setDelimiter(d: String) {
        delimiter = d
    }

    fun separate(input: String): List<String> {
        println(delimiter)
        return input.split(delimiter)
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