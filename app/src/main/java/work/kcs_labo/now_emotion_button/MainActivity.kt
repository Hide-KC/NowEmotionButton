package work.kcs_labo.now_emotion_button

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.main_activity.*
import work.kcs_labo.now_emotion_button.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)

    setupWidget(binding)

    MobileAds.initialize(this) { _ ->
      //TODO("Not yet implemented")
      println("MobileAds initialized.")
    }
    bannerAds.loadAd(AdRequest.Builder().build())
  }

  private fun setupWidget(binding: MainActivityBinding) {
    binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
      when (item.itemId) {
        R.id.home -> {
          //TODO("Not yet implemented")
          return@setOnNavigationItemSelectedListener true
        }
        R.id.people -> {
          //TODO("Not yet implemented")
          return@setOnNavigationItemSelectedListener true
        }
        R.id.calendar -> {
          //TODO("Not yet implemented")
          return@setOnNavigationItemSelectedListener true
        }
        R.id.setting -> {
          //TODO("Not yet implemented")
          return@setOnNavigationItemSelectedListener true
        }
        else -> {
          throw IllegalArgumentException("Illegal itemId was selected")
        }
      }
    }
  }
}
