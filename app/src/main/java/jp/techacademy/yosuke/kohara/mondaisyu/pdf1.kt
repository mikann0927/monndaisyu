package jp.techacademy.yosuke.kohara.mondaisyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joanzapata.pdfview.PDFView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pdf1.*

class pdf1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf1)

        val pdfView = findViewById<PDFView>(R.id.pdfview)
        pdfView.fromAsset("q1.pdf")
            .defaultPage(1)
            .showMinimap(false)
            .enableSwipe(true)
            .load()


        a1.setOnClickListener {

            val pdfView = findViewById<PDFView>(R.id.pdfview)
            pdfView.fromAsset("a1.pdf")
                .defaultPage(1)
                .showMinimap(false)
                .enableSwipe(true)
                .load()


        }
    }
}