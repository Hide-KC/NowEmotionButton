package work.kcs_labo.now_emotion_button.page;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import work.kcs_labo.now_emotion_button.MainActivityViewModel

/**
 * Created by hide1 on 2020/07/07.
 * ProjectName Now Emotion Button
 */

class CalendarFragment : Fragment() {

  private val viewModel: MainActivityViewModel by activityViewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return super.onCreateView(inflater, container, savedInstanceState)
  }

  companion object {
    fun getInstance(bundle: Bundle? = null): CalendarFragment {
      val fragment = CalendarFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}