package com.example.kintaisys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewAnimator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンの取得
        val btnTouroku = findViewById<Button>(R.id.Touroku)
        val btnScan = findViewById<Button>(R.id.ScanButton)

        //登録ボタンにリスナ登録
        btnTouroku.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View?){
                //Intentクラスのオブジェクト生成
                val intent = Intent(this@MainActivity, Touroku::class.java)
                //生成オブジェクトを引数に画面を起動する
                startActivity(intent)
            }
        })
        //スキャンボタンにリスナ登録
        btnScan.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View?){
                //Intentクラスのオブジェクト生成
                val intent = Intent(this@MainActivity, Scan::class.java)
                //生成オブジェクトを引数に画面を起動する
                startActivity(intent)
            }
        })
    }
}
