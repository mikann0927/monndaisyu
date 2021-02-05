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

        Q1.setOnClickListener {
            val intent = Intent(this, pdf1::class.java)
            startActivity(intent)
        }

        Q2.setOnClickListener {
            val intent = Intent(this, pdf2::class.java)
            startActivity(intent)
        }

        Q3.setOnClickListener {
            val intent = Intent(this, pdf3::class.java)
            startActivity(intent)
        }

        Q4.setOnClickListener {
            val intent = Intent(this, pdf4::class.java)
            startActivity(intent)
        }

        Q5.setOnClickListener {
            val intent = Intent(this, pdf5::class.java)
            startActivity(intent)
        }

        Q6.setOnClickListener {
            val intent = Intent(this, pdf6::class.java)
            startActivity(intent)
        }

        Q7.setOnClickListener {
            val intent = Intent(this, pdf7::class.java)
            startActivity(intent)
        }

        }
    }