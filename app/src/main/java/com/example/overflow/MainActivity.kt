package com.example.overflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.overflow.fragments.HomeArticleFragment
import com.example.overflow.ui.theme.OverflowMobileTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injecter le fragment dans la boite (fragment_home_articles)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_home_articles, HomeArticleFragment())
        transaction.addToBackStack(null)
        transaction.commit()

    }
}
