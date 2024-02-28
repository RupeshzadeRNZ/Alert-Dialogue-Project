package com.example.alertdialogueproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogueproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Q1.setOnClickListener {
            val data = arrayOf(
                "Android Phone Kit",
                "Android Page Kit",
                "Android Package Kit",
                "None of the above"
            )
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(binding.textView1.text)
            var current_data = 0
            builder1.setSingleChoiceItems(
                data,
                -1,
                DialogInterface.OnClickListener { dialogInterface, Item ->
                    current_data = Item
                })
            builder1.setPositiveButton("Submit") { dialogInterface, i ->
                when (current_data) {
                    0 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    1 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    2 -> {
                        Toast.makeText(
                            this,
                            data[current_data] + " Right Answers ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    3 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder1.setNegativeButton("Cancel") { dialogInterface, i ->

            }
            builder1.show()
        }

        binding.Q2.setOnClickListener {
            val data = arrayOf(
                "Application Programming Interface",
                "Android Programming Interface",
                "Android Page Interface",
                "Application Page Interface"
            )
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(binding.textView2.text)
            var current_data = 0
            builder1.setSingleChoiceItems(
                data,
                -1,
                DialogInterface.OnClickListener { dialogInterface, Item ->
                    current_data = Item
                })
            builder1.setPositiveButton("Submit") { dialogInterface, i ->
                when (current_data) {
                    0 -> {
                        Toast.makeText(
                            this,
                            data[current_data] + " Right Answers ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    1 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    2 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    3 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder1.setNegativeButton("Cancel") { dialogInterface, i ->
            }
            builder1.show()
        }

        binding.Q3.setOnClickListener {
            val data = arrayOf(
                "Android Class",
                "Android Package",
                "A single screen in an application with supporting java code",
                "None of the above"
            )
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(binding.textView3.text)
            var current_data = 0
            builder1.setSingleChoiceItems(
                data,
                -1,
                DialogInterface.OnClickListener { dialogInterface, Item ->
                    current_data = Item
                })
            builder1.setPositiveButton("Submit") { dialogInterface, i ->
                when (current_data) {
                    0 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    1 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    2 -> {
                        Toast.makeText(
                            this,
                            data[current_data] + " Right Answers ",
                            Toast.LENGTH_SHORT
                        ).show()

                    }

                    3 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder1.setNegativeButton("Cancel") { dialogInterface, i ->
            }
            builder1.show()
        }

        binding.Q4.setOnClickListener {
            val data = arrayOf(
                "Android debug bridge",
                "Android delete bridge",
                "Android destroy bridge",
                "None of the above"
            )
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(binding.textView4.text)
            var current_data = 0
            builder1.setSingleChoiceItems(
                data,
                -1,
                DialogInterface.OnClickListener { dialogInterface, Item ->
                    current_data = Item
                })
            builder1.setPositiveButton("Submit") { dialogInterface, i ->
                when (current_data) {
                    0 -> {
                        Toast.makeText(
                            this,
                            data[current_data] + " Right Answers ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    1 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    2 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    3 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder1.setNegativeButton("Cancel") { dialogInterface, i ->
            }
            builder1.show()
        }

        binding.Q5.setOnClickListener {
            val data = arrayOf(
                "Source code",
                "Permission that the application requires",
                "List of strings used in the app",
                "None of the above"
            )

            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(binding.textView5.text)
            var current_data = 0
            builder1.setSingleChoiceItems(
                data,
                -1,
                DialogInterface.OnClickListener { dialogInterface, Item ->
                    current_data = Item
                })
            builder1.setPositiveButton("Submit") { dialogInterface, i ->
                when (current_data) {
                    0 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    1 -> {
                        Toast.makeText(
                            this,
                            data[current_data] + " Right Answers ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    2 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }

                    3 -> {
                        Toast.makeText(this, "wrong Answers", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder1.setNegativeButton("Cancel") { dialogInterface, i ->
            }
            builder1.show()
        }

        binding.exitButton.setOnClickListener {
            dialog()
        }
    }

    private fun dialog() {
        val builder1 = AlertDialog.Builder(this)
        builder1.setTitle("Exit")
        builder1.setIcon(R.drawable.baseline_exit_to_app_24)
        builder1.setMessage("Are you sure you want to exit?")
        builder1.setPositiveButton("Yes") { dialogInterface, i ->
            finish()
        }
        builder1.setNegativeButton("No") { dialogInterface, i ->
        }
        builder1.show()

    }
}