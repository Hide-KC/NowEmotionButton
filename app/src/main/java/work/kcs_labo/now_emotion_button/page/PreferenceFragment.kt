package work.kcs_labo.now_emotion_button.page;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import work.kcs_labo.now_emotion_button.R

/**
 * Created by hide1 on 2020/07/07.
 * ProjectName Now Emotion Button
 */

class PreferenceFragment : PreferenceFragmentCompat() {
  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(R.xml.preferences, rootKey)
    findPreference<ListPreference>("theme")?.apply {
      setOnPreferenceChangeListener { _, newValue ->
        val id = newValue as String
//        ThemeSetting.setDefaultNightMode(ThemeEnum.idOf(id))
        true
      }
    }
  }

  companion object {
    fun getInstance(bundle: Bundle? = null): PreferenceFragment {
      val fragment = PreferenceFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}