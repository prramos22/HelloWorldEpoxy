package com.example.helloworldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    private var entries = mutableListOf<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        addBtn.setOnClickListener {
            val input = inputSomething.text.toString()

            if (!input.isBlank()) {
                entries.add(Data(input))

                recyclerView.withModels {
                    entries.forEach {
                        entry {
                            id(hashCode())
                            name(it.name)
                        }
                    }

                    inputSomething.text.clear()
                }
            }

        }
    }
}