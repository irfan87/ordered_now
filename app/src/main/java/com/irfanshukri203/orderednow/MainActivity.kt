package com.irfanshukri203.orderednow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val itemName = etItemName.text.toString()
            val itemQuantity = etItemQuantity.text.toString().toInt()
            val checkedDeliveryType = rgDelivery.checkedRadioButtonId
            val deliveryType = findViewById<RadioButton>(checkedDeliveryType)
            val deliveryString = """You have ordered:
                | $itemName ($itemQuantity items). 
                | You decided to use ${deliveryType.text} option""".trimMargin()

            tvResult.text = deliveryString
        }
    }
}