package e.joon2.event

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sam.*

class SAM : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sam)

        labelTextView.setOnClickListener{showToast("labelTextView click event...")}
        bellTextView.setOnClickListener{showToast("bellTextView click event...")}
        vibrateCheckView.setOnCheckedChangeListener { p0, p2 -> showToast("vibrateCheckView check event...") }
        repeatCheckView.setOnCheckedChangeListener { p0, p1 -> showToast("repeatCheckView check event...") }
    }//람다 함수를 이용하여 간단하게 코드를 바꿈.
    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
