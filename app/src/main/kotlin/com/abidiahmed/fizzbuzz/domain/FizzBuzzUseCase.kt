package com.abidiahmed.fizzbuzz.domain

import com.abidiahmed.fizzbuzz.FizzBuzz

class FizzBuzzUseCase {

    fun calculateFizzBuzz(fizzBuzz: FizzBuzz): ArrayList<String> {

        val result = ArrayList<String>()
        val hashMap = fizzBuzz.fizzBuzzHashMap
        for (number in 1..fizzBuzz.limit) {
            var value: String? = ""
            for (key in hashMap.keys) {
                if (number % key == 0) {
                    value += hashMap[key]
                }
            }

            if (value == "") {
                value += number.toString()
            }

            if (!value.isNullOrBlank()) {
                result.add(value)
            }
        }

        return result
    }
}