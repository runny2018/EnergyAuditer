package com.example.energyauditer100

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainGrid:GridLayout=findViewById(R.id.mainGrid)

        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for(i in 0 until mainGrid.childCount){
            val cardView: CardView= mainGrid.getChildAt(0) as CardView
            cardView.setOnClickListener({
                val intent= Intent(this, VentilationActivity::class.java)
                startActivity(intent)
            })

        }



    }
}
