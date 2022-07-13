package com.abidiahmed.fizzbuzz.domain

import com.abidiahmed.fizzbuzz.FizzBuzz
import com.abidiahmed.fizzbuzz.GameRule
import org.junit.Assert.assertEquals
import org.junit.Test
import java.math.BigInteger

class FizzBuzzUseCaseTest {

    @Test
    fun calculateFizzBuzz() {
        // Given
        val fizzBuzzUseCase = FizzBuzzUseCase()
        val expectedResult = arrayListOf<String>("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz")
        val fizzBuzz = FizzBuzz(GameRule(3, "fizz"), GameRule(5, "buzz"), 15)

        // When
        val result = fizzBuzzUseCase.calculateFizzBuzz(fizzBuzz)

        // Then
        assertEquals(result, expectedResult)
    }
}