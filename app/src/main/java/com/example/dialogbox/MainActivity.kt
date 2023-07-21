package com.example.dialogbox

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            // Custom Dialog
            // Custom Dialog is a dialog box/popup window that can be used to display information
            val dialogBinding = layoutInflater.inflate(R.layout.my_custom_dialog, null)

            // Dialog
            // Dialog is a small window that prompts the user to make a decision or enter additional information
            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            // If you want to cancel the dialog box, you can use the setCancelable() method
            // How to cancel it? Just click outside the dialog box
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
        }
    }
}