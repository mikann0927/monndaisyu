package jp.techacademy.yosuke.kohara.mondaisyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joanzapata.pdfview.PDFView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        q1.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q2.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q3.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q4.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q5.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q6.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        q7.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        }
    }