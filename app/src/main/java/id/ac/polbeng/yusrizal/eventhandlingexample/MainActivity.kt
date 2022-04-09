package id.ac.polbeng.yusrizal.eventhandlingexample

import android.nfc.tech.NfcV
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDisplayMessage.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Hello World",
                Toast.LENGTH_LONG).show()
            }

            btnDisplayMessage.setOnLongClickListener(object: View.OnLongClickListener{
                override fun onLongClick(v: View?): Boolean {
                    return true
                }

            }            })
        })
    }
}