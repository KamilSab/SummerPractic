package ru.itis.summerpractic24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractic24.databinding.FragmentMessageBinding

class MessageFragment : Fragment(R.layout.fragment_message) {
    private var binding: FragmentMessageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessageBinding.bind(view)

        binding!!.button.setOnClickListener() {
            val text = binding!!.editText.text.toString().trim()
            val bundle = Bundle()
            bundle.putString("TEXT", text)

            if (text.isEmpty()) {
                Snackbar.make(
                    view,
                    "Для отправки текста требуется заполнить поле",
                    Snackbar.LENGTH_SHORT
                ).show()
            } else {
                findNavController().navigate(
                    R.id.action_messageFragment_to_resultFragment,
                    args = bundle
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}