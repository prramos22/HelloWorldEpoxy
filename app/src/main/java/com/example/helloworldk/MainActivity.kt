package com.example.helloworldk

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context: Context = MainActivity()

        clkmebtn.setOnClickListener {
            val name = textView

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


        }
        fun onSNACK(view: View) {
            //Snackbar(view)
            val snackbar = Snackbar.make(
                view, "Replace with your own action",
                Snackbar.LENGTH_LONG
            ).setAction("Action", null)
            snackbar.show()
        }

    }
}
