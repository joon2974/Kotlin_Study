package e.joon2.visible_button_solution

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*//이게 없으면 btn = findViewById(R.id.xmlbtn)처럼 값을 받아와야 함

class MainActivity : AppCompatActivity(), View.OnClickListener {//onClickListener 오버라이드

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVisibleTrue.setOnClickListener(this) //onclick 함수 따로 사용
        btnVisibleFalse.setOnClickListener(this) //이걸 쓰면 import가 자동으로 됨
        btnVisibleGone.setOnClickListener(this)
    }

    override fun onClick(p0: View?){ //onclick 오버라이드
        if(p0 == btnVisibleTrue){ //visiblebtn이 클릭 되면
            textVisibleTarget?.visibility = View.VISIBLE //텍스트가 보이게
        }else if(p0 == btnVisibleFalse){//a ?. b a가 null 이 아니면 b, null이면 null
            textVisibleTarget?.visibility = View.INVISIBLE //텍스트가 안보이게
        }else if(p0 == btnVisibleGone){
            textVisibleTarget?.visibility = View.GONE //텍스트를 아예 배제, 공간도 남기지 않음!!
        }//예제엔 없었으나 추가해봄
    }
}
