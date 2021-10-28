package com.example.calculadora3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    var numeroA=0.0
    var numeroB=0.0
    var numeroPantalla=""
    var operacion=0

    var uno=1
    var dos=2
    var tres=3
    var cuatro=4
    var cinco=5
    var seis=6
    var siete=7
    var ocho=8
    var nueve=9
    var cero=0
    var punto="."



override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.uno.setOnClickListener {
        numeroPantalla += uno.toString()
        binding.pantalla.setText(numeroPantalla)

    }
    binding.dos.setOnClickListener {
        numeroPantalla += dos.toString()
        binding.pantalla.setText(numeroPantalla)

    }
    binding.tres.setOnClickListener {
        numeroPantalla += tres.toString()
        binding.pantalla.setText(numeroPantalla)

    }
    binding.cuatro.setOnClickListener {
        numeroPantalla += cuatro.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.cinco.setOnClickListener {
        numeroPantalla += cinco.toString()
        binding.pantalla.setText(numeroPantalla)

    }
    binding.seis.setOnClickListener {
        numeroPantalla += seis.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.siete.setOnClickListener {
        numeroPantalla += siete.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.ocho.setOnClickListener {
        numeroPantalla += ocho.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.nueve.setOnClickListener {
        numeroPantalla += nueve.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.cero.setOnClickListener {
        numeroPantalla += cero.toString()
        binding.pantalla.setText(numeroPantalla)

    }

    binding.teclaPunto.setOnClickListener {
        numeroPantalla += punto
        binding.pantalla.setText(numeroPantalla)

    }

    binding.teclaC.setOnClickListener{
        numeroPantalla=""
        binding.pantalla.setText("")
    }

    binding.teclaCE.setOnClickListener{
        numeroPantalla=""
        binding.pantalla.setText("")
    }

    binding.teclaSumar.setOnClickListener{
        numeroA=numeroPantalla.toDouble()
        numeroPantalla=""
        binding.pantalla.setText("+")
        operacion=1

    }

    binding.teclaRestar.setOnClickListener{
        numeroA=numeroPantalla.toDouble()
        numeroPantalla=""
        binding.pantalla.setText("-")
        operacion=2
    }

    binding.teclaMultiplicar.setOnClickListener{
        numeroA=numeroPantalla.toDouble()
        numeroPantalla=""
        binding.pantalla.setText("x")
        operacion=3
    }

    binding.teclaDividir.setOnClickListener{
        numeroA=numeroPantalla.toDouble()
        numeroPantalla=""
        binding.pantalla.setText("/")
        operacion=4
    }

    binding.teclaIgual.setOnClickListener{
        if(operacion==1){
            numeroPantalla=(numeroPantalla.toDouble()+numeroA).toString()
        }
        if (operacion==2){
            numeroPantalla=(numeroA-numeroPantalla.toDouble()).toString()
        }
        if (operacion==3){
            numeroPantalla=(numeroPantalla.toDouble()*numeroA).toString()
        }
        if (operacion==4) {
            numeroPantalla = (numeroA / numeroPantalla.toDouble()).toString()
        }
        //esto no funciona
        if (numeroPantalla.endsWith(".0")){
            numeroPantalla.dropLast(2)
        }

        binding.pantalla.setText(numeroPantalla)

    }








}
}