package com.example.cashflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabHost = findViewById<TabHost>(R.id.tabHost)
        tabHost.setup()

        var spec: TabHost.TabSpec = tabHost.newTabSpec("Tab One")
        spec.setContent(R.id.tab1)
        spec.setIndicator("Nhập vào")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("Tab Two")
        spec.setContent(R.id.tab2)
        spec.setIndicator("Lịch")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("Tab Three")
        spec.setContent(R.id.tab3)
        spec.setIndicator("Biểu đồ")
        tabHost.addTab(spec)
    }
}