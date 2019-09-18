package mx.edu.tpdm_u1_ejercicio8_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*
import org.w3c.dom.Text

class Main2Activity : AppCompatActivity() {
        var layuMostrar : LinearLayout ?= null
        var mostrar : Button ?= null
        var posicion = 0
        var editpos : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        layuMostrar = findViewById( R.id.layoutMostrar)
        mostrar = findViewById( R.id.btnMostrar)
        editpos = findViewById( R.id.editPosicion)
        mostrar?.setOnClickListener {
            var valores = intent.extras?.getString("valor")
            posicion = editpos?.text.toString().toInt()
            var vector = valores?.split(",")

            if(posicion > vector!!.size || posicion < 0){
                AlertDialog.Builder(this).setTitle("Error").setMessage("Posición incorrecta")
                    .setPositiveButton("Aceptar"){dialog, which -> }.show()
            }
            var etimostrarValor = TextView(this)

            etimostrarValor?.setText("valor: "+vector[posicion])
            etimostrarValor.textSize = 25f
            layuMostrar?.addView(etimostrarValor)
        }

    }
}
