package com.abidiahmed.fizzbuzz.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abidiahmed.fizzbuzz.FizzBuzz
import com.abidiahmed.fizzbuzz.GameRule
import com.abidiahmed.fizzbuzz.databinding.UserInputActivityBinding

class UserInputActivity : AppCompatActivity() {

    lateinit var userInputActivityBinding: UserInputActivityBinding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userInputActivityBinding = UserInputActivityBinding.inflate(layoutInflater)
        val view = userInputActivityBinding.root
        setContentView(view)

        userInputActivityBinding.run {
            button.setOnClickListener {
                val fizzBuzz = fizzBuzz()

                val intent = Intent(this@UserInputActivity, ResultListActivity::class.java)
                intent.putExtra("FIZZ_BUZZ_KEY", fizzBuzz)
                startActivity(intent)
            }
        }
    }

    private fun UserInputActivityBinding.fizzBuzz(): FizzBuzz {
        val firstNumber = firstNumber.text.toString().toInt()
        val secondNumber = secondNumber.text.toString().toInt()
        val firstText = firstText.text.toString()
        val secondText = secondText.text.toString()
        val limit = limit.text.toString().toInt()

        val gameRule = GameRule(firstNumber, firstText)
        val gameRule2 = GameRule(secondNumber, secondText)

        return FizzBuzz(gameRule, gameRule2, limit)
    }

}
