package e.joon2.linearlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if(p0 == btn){
            val intent = Intent(this, Relative_layout::class.java)
            startActivity(intent)
        }
    }
}
