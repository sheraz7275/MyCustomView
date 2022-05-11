package com.example.mycustomview

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class CustomEditText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val imageView:ImageView
    private val editText:EditText


    init {
        val inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view= inflater.inflate(R.layout.custom_edit,this,true)
        imageView=view.findViewById(R.id.imageView)
        editText=view.findViewById(R.id.editText)
        setListener()
    }


    private fun setListener(){
        imageView.setOnClickListener {
            editText.text.clear()
        }
    }





}