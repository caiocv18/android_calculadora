package com.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operando1: EditText = findViewById(R.id.edtOperando1)
        val operando2: EditText = findViewById(R.id.edtOperando2)
        val soma: Button = findViewById(R.id.btnSoma)
        val subtracao: Button = findViewById(R.id.btnSubtracao)
        val multiplicacao: Button = findViewById(R.id.btnMultiplicacao)
        val divisao: Button = findViewById(R.id.btnDivisao)

        soma.setOnClickListener{
            val valor1: Float = operando1.text.toString().toFloat()
            val valor2: Float = operando2.text.toString().toFloat()
            val resultado: Float = valor1 + valor2
            Toast.makeText(this,resultado.toString(), Toast.LENGTH_LONG).show()
        }

        subtracao.setOnClickListener{
            val valor1: Float = operando1.text.toString().toFloat()
            val valor2: Float = operando2.text.toString().toFloat()
            val resultado: Float = valor1 - valor2
            Toast.makeText(this,resultado.toString(), Toast.LENGTH_LONG).show()
        }

        multiplicacao.setOnClickListener{
            val valor1: Float = operando1.text.toString().toFloat()
            val valor2: Float = operando2.text.toString().toFloat()
            val resultado: Float = valor1 * valor2
            Toast.makeText(this,resultado.toString(), Toast.LENGTH_LONG).show()
        }

        divisao.setOnClickListener{
            val valor1: Float = operando1.text.toString().toFloat()
            val valor2: Float = operando2.text.toString().toFloat()
            val resultado: Float = valor1 / valor2
            Toast.makeText(this,resultado.toString(), Toast.LENGTH_LONG).show()
        }
    }
}