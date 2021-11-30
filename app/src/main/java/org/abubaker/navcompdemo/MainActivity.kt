package org.abubaker.navcompdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import org.abubaker.navcompdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Make the navController variable global.
    private lateinit var navController: NavController

    /**
     * onCreate()
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // The #fragment inside the activity_main contains our NavigationController
        navController = Navigation.findNavController(this@MainActivity, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this@MainActivity, navController)

    }

    // Override the below method and
    override fun onSupportNavigateUp(): Boolean {

        // Pass the navController variable in it, after doing this the back button will be enable.
        return NavigationUI.navigateUp(navController, null)

    }

}