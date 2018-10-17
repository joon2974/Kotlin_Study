package e.joon2.event

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        labelTextView.setOnClickListener(this)
        bellTextView.setOnClickListener(this)
        vibrateCheckView.setOnCheckedChangeListener(this)
        repeatCheckView.setOnCheckedChangeListener(this)
        sambtn.setOnClickListener(this)
    }

    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onClick(p0: View?){
        if(p0 == labelTextView){
            showToast("labelTextView click event...")
        }else if(p0 == bellTextView){
            showToast("bellTextView click event...")
        }else if(p0 == sambtn){
            val intent = Intent(this, SAM::class.java)
            startActivity(intent)
        }
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        if(p0 == vibrateCheckView){
            showToast("vibrateCheckView check event...")
        }else if(p0 == repeatCheckView){
            showToast("repeatCheckView check event...")
        }
    }
}
