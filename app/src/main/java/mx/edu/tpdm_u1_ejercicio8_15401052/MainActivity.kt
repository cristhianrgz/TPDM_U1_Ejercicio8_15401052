package mx.edu.tpdm_u1_ejercicio8_15401052

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var layu : LinearLayout ?= null
    var abrir : Button ?= null
    var valores : EditText ?= null
    var cadena = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layu = findViewById( R.id.layu)
        abrir = findViewById( R.id.btnAbrir)
        valores = findViewById( R.id.editValores)

        abrir?.setOnClickListener {
            cadena = valores?.text.toString()
            var abrirActivity = Intent(this, Main2Activity::class.java)
            abrirActivity.putExtra("valor",cadena)

            startActivity(abrirActivity)
        }
    }
}
