package campalans.m8.marcanimation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import campalans.m8.marcanimation2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}
        val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.primera_animacio)
        binding.tvmain.startAnimation(animation)
    }
}