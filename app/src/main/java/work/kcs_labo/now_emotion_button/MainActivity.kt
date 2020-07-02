package work.kcs_labo.now_emotion_button

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    MobileAds.initialize(this) { _ ->
      //TODO("Not yet implemented")
      println("MobileAds initialized.")
    }

    banner_ads.loadAd(AdRequest.Builder().build())
  }
}
