package acosta.gutierrez.myhealthapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val peso: EditText = findViewById(R.id.weigth) as EditText
        val altura: EditText  = findViewById(R.id.height) as EditText
        val calcular: Button = findViewById(R.id.calculate) as Button
        val imc: TextView = findViewById(R.id.imc) as TextView
        val rango: TextView = findViewById(R.id.range) as TextView





        calcular.setOnClickListener(){

            val p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()
            var imc2: Float = p/(a*a)
            imc.setText(""+imc2+"")

            if(imc2 < 18.5){
                rango.setText("Por debajo de tu peso")
                rango.setBackgroundResource(R.color.greenish)
            }
            if(imc2 >= 18.5 && imc2 <= 24.9){
                rango.setText("Saludable")
                rango.setBackgroundResource(R.color.green)
            }
            if(imc2 >= 25 && imc2 <= 29.9){
                rango.setText("Sobrepeso")
                rango.setBackgroundResource(R.color.yellow)
            }
            if(imc2 >= 30 && imc2 <= 39.9){
                rango.setText("Sobrepeso")
                rango.setBackgroundResource(R.color.orange)
            }
            else{
                rango.setText("Obesidad Morbida")
                rango.setBackgroundResource(R.color.red)
            }






        }








    }
}
