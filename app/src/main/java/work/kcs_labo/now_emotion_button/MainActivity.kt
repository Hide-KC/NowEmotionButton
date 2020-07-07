package work.kcs_labo.now_emotion_button

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.main_activity.*
import work.kcs_labo.now_emotion_button.databinding.MainActivityBinding
import work.kcs_labo.now_emotion_button.page.HomeFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)

    setupWidget(binding)

    val viewModel: MainActivityViewModel by viewModels()

    MobileAds.initialize(this) { _ ->
      //TODO("Not yet implemented")
      println("MobileAds initialized.")
    }
    bannerAds.loadAd(AdRequest.Builder().build())
  }

  private fun setupWidget(binding: MainActivityBinding) {
    setSupportActionBar(toolbar)

    binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
      when (item.itemId) {
        R.id.home -> {
          //TODO("Not yet implemented")
          binding.fab.setImageResource(android.R.drawable.ic_input_add)
          binding.fab.show()
          return@setOnNavigationItemSelectedListener true
        }
        R.id.people -> {
          //TODO("Not yet implemented")
          binding.fab.show()
          binding.fab.setImageResource(R.drawable.ic_person_add_24px)
          return@setOnNavigationItemSelectedListener true
        }
        R.id.calendar -> {
          //TODO("Not yet implemented")
          binding.fab.hide()
          return@setOnNavigationItemSelectedListener true
        }
        R.id.setting -> {
          //TODO("Not yet implemented")
          binding.fab.hide()
          return@setOnNavigationItemSelectedListener true
        }
        else -> {
          throw IllegalArgumentException("Illegal itemId was selected")
        }
      }
    }

    binding.fab.setOnClickListener {
      //TODO("Not yet implemented")
    }
  }
}
