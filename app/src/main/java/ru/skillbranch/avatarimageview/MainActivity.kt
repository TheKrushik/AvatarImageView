package ru.skillbranch.avatarimageview

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.avatarimageview.ui.custom.AvatarImageView

class MainActivity : AppCompatActivity() {
//    private val stId = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val view = AvatarImageView(this).apply {
////            id = View.generateViewId() // increment
//            id = stId
//            layoutParams = LinearLayout.LayoutParams(120, 120)
//            setImageResource(R.drawable.ava_big)
//        }
//        container.addView(view)

        btn_border.setOnClickListener {
            aiv.setBorderWidth((2..10).random())
        }

        btn_color.setOnClickListener {
            aiv.setBorderColor((AvatarImageView.bgColors).random())
        }

    }
}
