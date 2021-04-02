package com.lulu.jacocodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btGenerateEc.setOnClickListener {
            JaCoCoUtils.generateCoverageReport(this)
        }

        StudentA().action("测试 A 同学")
        StudentB().action("测试 B 同学")
        StudentA().StudentAChild().action("测试 A 的孩子")
    }
}