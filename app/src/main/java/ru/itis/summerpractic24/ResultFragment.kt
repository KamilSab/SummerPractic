package ru.itis.summerpractic24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.itis.summerpractic24.databinding.FragmentResultBinding


class ResultFragment : Fragment(R.layout.fragment_result) {
    private var binding: FragmentResultBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)

        val text = arguments?.getString("TEXT")
        binding!!.displayText.text = text
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}