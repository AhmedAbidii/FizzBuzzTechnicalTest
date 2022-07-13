package com.abidiahmed.fizzbuzz

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import java.math.BigInteger


@Parcelize
class GameRule(
    val divisor: Int,
    val word: String
) : Parcelable

@Parcelize
class FizzBuzz constructor(
    val fizzRule: GameRule = GameRule(3, "fizz"),
    val buzzRule: GameRule = GameRule(5, "buzz"),
    val limit: Int = 100
) : Parcelable {

    @IgnoredOnParcel
    val fizzBuzzHashMap: HashMap<Int, String> = object : HashMap<Int, String>() {
        init {
            put(fizzRule.divisor, fizzRule.word)
            put(buzzRule.divisor, buzzRule.word)
        }
    }

}
