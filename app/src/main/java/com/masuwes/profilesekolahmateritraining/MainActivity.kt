package com.masuwes.profilesekolahmateritraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColor
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.masuwes.profilesekolahmateritraining.R.color.colorAccent
import com.masuwes.profilesekolahmateritraining.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host: NavHostFragment? = supportFragmentManager
            .findFragmentById(R.id.fragment_container) as NavHostFragment? ?:return
        val navController= host!!.navController

        nav_bar.setupWithNavController(navController)
//        binding.navBar.setupWithNavController(navController)
    }
}