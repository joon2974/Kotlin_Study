package e.joon2.visible_button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun true_clicked(v: View){
        control_btn.visibility = View.VISIBLE
    }
    fun false_clicked(v: View){
        control_btn.visibility = View.INVISIBLE
    }

}
