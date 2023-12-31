package ke.ac.tukenya.scit.seedclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
            private val SPLASH_TIME_OUT:Long = 3000 // This is 3 seconds

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_splashscreen)
                Handler().postDelayed({
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    startActivity(Intent(this,MainActivity::class.java))
                    // close this activity
                    finish()
                }, SPLASH_TIME_OUT)
            }
        }
