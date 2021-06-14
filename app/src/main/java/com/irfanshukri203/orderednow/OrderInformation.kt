package com.irfanshukri203.orderednow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order_information.*

class OrderInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_information)

        val itemName = intent.getStringExtra("EXTRA_ITEM_NAME")
        val itemQuantity = intent.getIntExtra("EXTRA_ITEM_QUANTITY", 0)
        val deliveryType = intent.getStringExtra("EXTRA_DELIVERY_TYPE")

        val orderInformationString = """
                Item Name: $itemName
                Quantity: $itemQuantity
                Delivery Type: $deliveryType
            """.trimIndent()

        tvOrderInformation.text = orderInformationString
//        btnPaid.setOnClickListener {
//        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}