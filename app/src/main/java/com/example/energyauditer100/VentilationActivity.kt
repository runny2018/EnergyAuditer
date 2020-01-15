package com.example.energyauditer100

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class VentilationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventilation)

        val edittext_length: EditText=findViewById(R.id.edittext_length) as EditText
        val edittext_width: EditText=findViewById(R.id.edittext_width) as EditText
        val edittext_height: EditText=findViewById(R.id.edittext_height) as EditText





        var length=0
        var width=0
        var height=0

        var lengthString =edittext_length.text.toString()
        if(lengthString.trim().length>0)
        {
            length = lengthString.toInt()
        }

        var widthString=edittext_width.text.toString()
        if (widthString.trim().length>0)
        {
            width= widthString.toInt()
        }

        var heightString=edittext_height.text.toString()
        if (heightString.trim().length>0)
        {
            height=heightString.toInt()
        }


        var volume: Int=length*width*height;



        val spinner_chooseroomtype: Spinner=findViewById(R.id.spinner_chooseroomtype) as Spinner
        val roomTypeArrayAdapter=ArrayAdapter(this, android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.room_types))
        roomTypeArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner_chooseroomtype.adapter=roomTypeArrayAdapter

    }
}
