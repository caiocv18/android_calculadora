package com.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var soma: Button
    private lateinit var subtracao: Button
    private lateinit var multiplicacao: Button
    private lateinit var divisao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soma = findViewById(R.id.btnSoma)
        soma.setOnClickListener(this)

        subtracao = findViewById(R.id.btnSubtracao)
        subtracao.setOnClickListener(this)

        multiplicacao = findViewById(R.id.btnMultiplicacao)
        multiplicacao.setOnClickListener(this)

        divisao = findViewById(R.id.btnDivisao)
        divisao.setOnClickListener(this)
    }

    private fun calculo(numero1: Double, numero2: Double, operador:String){

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val resultado: Double

        if(operador == "+"){
            resultado = numero1 + numero2
            txtResultado.text = resultado.toString()
        }else if( operador == "-"){
            resultado = numero1 - numero2
            txtResultado.text = resultado.toString()
        }else if (operador == "*"){
            resultado = numero1 * numero2
            txtResultado.text = resultado.toString()
        }else{
            resultado = numero1 / numero2
            txtResultado.text = resultado.toString()
        }

    }

    override fun onClick(p0: View?) {
        val numero1 = findViewById<EditText>(R.id.edtOperando1)
        val numero2 = findViewById<EditText>(R.id.edtOperando2)
        when(p0?.id){
            R.id.btnSoma->{
                calculo(numero1.text.toString().toDouble(), numero2.text.toString().toDouble(),"+")
            }
            R.id.btnSubtracao->{
                calculo(numero1.text.toString().toDouble(), numero2.text.toString().toDouble(),"-")
            }
            R.id.btnMultiplicacao->{
                calculo(numero1.text.toString().toDouble(), numero2.text.toString().toDouble(),"*")
            }
            R.id.btnDivisao->{
                calculo(numero1.text.toString().toDouble(), numero2.text.toString().toDouble(),"/")
            }
        }


    }
}