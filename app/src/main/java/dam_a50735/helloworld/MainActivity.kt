package dam_a50735.helloworld

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    // Controla qual imagem está a ser mostrada
    private var isHeart = true

    // Handler para atualizar a hora na thread principal
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtém a referência à ImageView e à TextView da hora
        val imageView = findViewById<ImageView>(R.id.imageView)
        val tvTime = findViewById<TextView>(R.id.tvTime)

        // Troca a imagem ao clicar
        imageView.setOnClickListener {
            if (isHeart) {
                // Muda para a estrela
                imageView.setImageResource(R.drawable.star)
                isHeart = false
            } else {
                // Volta ao coração
                imageView.setImageResource(R.drawable.heart)
                isHeart = true
            }
        }

        // Cria um Runnable que atualiza a hora a cada segundo
        val updateTime = object : Runnable {
            override fun run() {
                // Formata a hora atual
                val hora = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
                // Atualiza o TextView
                tvTime.text = "Current time: $hora"
                // Agenda a próxima atualização daqui a 1 segundo
                handler.postDelayed(this, 1000)
            }
        }

        // Inicia a atualização da hora
        handler.post(updateTime)

        // Envia uma mensagem para o Logcat quando a Activity é criada
        println(getString(R.string.activity_oncreate_msg, this@MainActivity.localClassName))
    }
}