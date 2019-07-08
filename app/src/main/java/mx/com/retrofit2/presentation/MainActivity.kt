package mx.com.retrofit2.presentation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mx.com.retrofit2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityBtApiTiempo.setOnClickListener({
            var intent = Intent(this, TiempoActivity::class.java)
            startActivity(intent)
        })
    }
}
