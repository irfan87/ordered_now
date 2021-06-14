package com.irfanshukri203.orderednow

import android.content.Intent
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

            Intent(this, OrderInformation::class.java).also {
                it.putExtra("EXTRA_ITEM_NAME", itemName)
                it.putExtra("EXTRA_ITEM_QUANTITY", itemQuantity)
                it.putExtra("EXTRA_DELIVERY_TYPE", deliveryType.text)

                startActivity(it)
            }
        }
    }
}