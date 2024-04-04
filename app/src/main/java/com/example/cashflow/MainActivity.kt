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
        spec.setIndicator("Tiền chi tiêu")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("Tab Two")
        spec.setContent(R.id.tab2)
        spec.setIndicator("Tiền kiếm được")
        tabHost.addTab(spec)
    }
}