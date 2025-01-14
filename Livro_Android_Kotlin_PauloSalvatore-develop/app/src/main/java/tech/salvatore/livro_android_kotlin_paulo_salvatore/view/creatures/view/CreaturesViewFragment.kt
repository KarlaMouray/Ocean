package tech.salvatore.livro_android_kotlin_paulo_salvatore.view.creatures.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import tech.salvatore.livro_android_kotlin_paulo_salvatore.databinding.CreaturesViewFragmentBinding
import tech.salvatore.livro_android_kotlin_paulo_salvatore.viewmodel.CreatureViewModel

@AndroidEntryPoint
class CreaturesViewFragment : Fragment() {
    private lateinit var binding: CreaturesViewFragmentBinding

    private val viewModel: CreatureViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            CreaturesViewFragmentBinding.inflate(
                layoutInflater,
                container,
                false
            )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val safeArgs: CreaturesViewFragmentArgs by navArgs()
        val creatureId = safeArgs.creatureId

        viewModel.id.value = creatureId

        binding.viewModel = viewModel
    }
}
