package com.example.serticivan.calculatorapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number = ""
    var numberOne = 0.0f
    var numberTwo = 0.0f

    private var isAddition: Boolean = false
    private var isSubtraction: Boolean = false
    private var isDivide: Boolean = false
    private var isMultiple: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun operationFunction(view: View) {

        var editText: EditText? = findViewById((R.id.show_numbers_edittext))
        var showResultTv: TextView? = findViewById((R.id.show_result_textview))
        var operationTv: TextView? = findViewById((R.id.operation_textview))

        when (view.id) {
            R.id.one_btn -> {
                number += 1
                editText?.setText(number)
            }
            R.id.two_btn -> {
                number += 2
                editText?.setText(number)
            }

            R.id.three_btn -> {
                number += 3
                editText?.setText(number)
            }
            R.id.four_btn -> {
                number += 4
                editText?.setText(number)
            }
            R.id.five_btn -> {
                number += 5
                editText?.setText(number)
            }

            R.id.six_btn -> {
                number += 6
                editText?.setText(number)
            }
            R.id.seven_btn -> {
                number += 7
                editText?.setText(number)
            }
            R.id.eight_btn -> {
                number += 8
                editText?.setText(number)
            }

            R.id.nine_btn -> {
                number += 9
                editText?.setText(number)
            }

            R.id.zero_btn -> {
                number += 0
                editText?.setText(number)
            }

            R.id.dot_btn -> {
                number += "."
                editText?.setText(number)
            }

            R.id.clear_btn -> {
                number = ""
                editText?.setText("")
                showResultTv?.text = "0"
                operationTv?.text = ""
            }

            R.id.plus_btn -> {
                if (number.isEmpty()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number = ""
                }
            }

            R.id.minus_btn -> {
                if (number.isEmpty()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isSubtraction = true
                    number = ""
                }
            }

            R.id.multiple_btn -> {
                if (number.isEmpty()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isMultiple = true
                    number = ""
                }
            }

            R.id.division_btn -> {
                if (number.isEmpty()) {
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isDivide = true
                    number = ""
                }
            }

            R.id.equal_btn -> {
                when {
                    isAddition -> {
                        numberTwo = number.toFloat()
                        showResultTv?.text = (numberOne + numberTwo).toString()
                        operationTv?.text = "$numberOne + $numberTwo"
                        editText?.setText("")
                        isAddition = false
                    }
                    isSubtraction -> {
                        numberTwo = number.toFloat()
                        showResultTv?.text = (numberOne - numberTwo).toString()
                        operationTv?.text = "$numberOne - $numberTwo"
                        editText?.setText("")
                        isSubtraction = false
                    }
                    isMultiple -> {
                        numberTwo = number.toFloat()
                        showResultTv?.text = (numberOne * numberTwo).toString()
                        operationTv?.text = "$numberOne * $numberTwo"
                        editText?.setText("")
                        isMultiple = false
                    }
                    isDivide -> {
                        numberTwo = number.toFloat()
                        showResultTv?.text = (numberOne / numberTwo).toString()
                        operationTv?.text = "$numberOne / $numberTwo"
                        editText?.setText("")
                        isDivide = false
                    }
                }
            }

        }


    }
}
