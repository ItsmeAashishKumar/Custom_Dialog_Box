package com.example.customdailogbox

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder
import com.example.customdailogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn2.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Choose One")
            val options= arrayOf("option 1","option 2","option 3")
            builder.setSingleChoiceItems(options,0,DialogInterface.OnClickListener(){
                dialogInterface, i ->
                Toast.makeText(this,"You Selected ${options[i]}",Toast.LENGTH_LONG).show()

            })
            builder.setPositiveButton("Accept",DialogInterface.OnClickListener(){
                    dialogInterface, i ->
            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener(){
                    dialogInterface, i ->
            })
            builder.show()
        }

        binding.btn3.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Are You Sure")
            builder.setMessage("Want to Quit")
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener(){
                dialogInterface, i ->
                finish()
            })

            builder.setNegativeButton("No",DialogInterface.OnClickListener(){
                dialogInterface, i ->

            })
            builder.show()
        }
        
        binding.btn1.setOnClickListener(){
            val builder=AlertDialog.Builder(this)
            val options= arrayOf("option 1","option 2","option 3")
            builder.setTitle("Multiple choice Dialog")
            builder.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener(){
                dialogInterface, i, b ->

                Toast.makeText(this,"You Selected ${options[i]}",Toast.LENGTH_LONG).show()

            })
            builder.setPositiveButton("Accept",DialogInterface.OnClickListener(){
                    dialogInterface, i ->
            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener(){
                    dialogInterface, i ->
            })
            builder.show()
        }

    }
}