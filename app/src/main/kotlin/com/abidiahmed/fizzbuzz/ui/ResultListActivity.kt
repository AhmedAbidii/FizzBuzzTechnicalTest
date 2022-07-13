package com.abidiahmed.fizzbuzz.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abidiahmed.fizzbuzz.FizzBuzz
import com.abidiahmed.fizzbuzz.databinding.ResultListActivityBinding
import com.abidiahmed.fizzbuzz.domain.FizzBuzzUseCase


class ResultListActivity : AppCompatActivity() {

    lateinit var resultListActivityBinding: ResultListActivityBinding
        private set
    var data: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        resultListActivityBinding = ResultListActivityBinding.inflate(layoutInflater)
        val view = resultListActivityBinding.root
        setContentView(view)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val fizzBuzz = intent.getParcelableExtra<FizzBuzz>("FIZZ_BUZZ_KEY") ?: throw IllegalArgumentException("FizzBuzz is null")

        val adapter = Adapter(FizzBuzzUseCase().calculateFizzBuzz(fizzBuzz))

        resultListActivityBinding.recyclerview.apply {
            setAdapter(adapter)
            setLayoutManager(LinearLayoutManager(this@ResultListActivity, RecyclerView.VERTICAL, false))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}