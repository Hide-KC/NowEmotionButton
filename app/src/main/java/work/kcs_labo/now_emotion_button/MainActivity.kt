package work.kcs_labo.now_emotion_button

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEach
import androidx.databinding.DataBindingUtil
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.main_activity.*
import work.kcs_labo.now_emotion_button.databinding.MainActivityBinding
import work.kcs_labo.now_emotion_button.page.*

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

      val fragment = when (item.itemId) {
        R.id.home -> {
          supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName) ?: HomeFragment.getInstance()
        }
        R.id.people -> {
          supportFragmentManager.findFragmentByTag(PeopleFragment::class.java.simpleName) ?: PeopleFragment.getInstance()
        }
        R.id.calendar -> {
          supportFragmentManager.findFragmentByTag(CalendarFragment::class.java.simpleName) ?: CalendarFragment.getInstance()
        }
        R.id.setting -> {
          supportFragmentManager.findFragmentByTag(PreferenceFragment::class.java.simpleName) ?: PreferenceFragment.getInstance()
        }
        else -> throw IllegalArgumentException()
      }

      println("Fragment Class Name is "+fragment.javaClass.simpleName)

      supportFragmentManager.beginTransaction().also {
        it.replace(R.id.mainContents, fragment, fragment::class.java.simpleName)
      }.commit()

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
