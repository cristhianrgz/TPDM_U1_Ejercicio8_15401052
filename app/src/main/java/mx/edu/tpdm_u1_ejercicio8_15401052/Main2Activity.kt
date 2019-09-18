package mx.edu.tpdm_u1_ejercicio8_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
        var etiqueta : TextView ?= null
        var mostrar : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        etiqueta = findViewById( R.id.etMostrar)
        mostrar = findViewById( R.id.btnMostrar)

        var valores = intent.extras?.getString("valor")

        var cad = valores.text.toString().split(',')
        var cad = valores.
        mostrar?.setOnClickListener {
            etiqueta?.setText(valores)
        }

    }
}
