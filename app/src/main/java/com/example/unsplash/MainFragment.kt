package com.example.unsplash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.view.size
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.unsplash.databinding.FragmentMainBinding
import com.example.unsplash.networking.data.models.Urls
import ru.ktsstudio.lection3.utils.autoCleared

class MainFragment : Fragment(R.layout.fragment_main) {
    private val viewModel: MainViewModel by viewModels()

    private val binding by viewBinding(FragmentMainBinding::bind)
    private var photoAdapter: MainAdapter by autoCleared()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        bindViewModel()

    }

    private fun initList() {
        photoAdapter = MainAdapter()
        binding.list.apply {
            adapter = photoAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }

    private fun bindViewModel() {
        viewModel.photoList.observe(viewLifecycleOwner, Observer {
            photoAdapter.items = it
            for(i in 0..photoAdapter.items.size) {
                savePhoto(i)
            }
        })
        viewModel.search(
            page = 1
        )
    }

    private fun savePhoto(i:Int) = with(binding) {
        viewModel.save(
            id = photoAdapter.items[i].id.toLong(),
            alt_description = photoAdapter.items[i].alt_description,
            raw = photoAdapter.items[i].urls.raw,
            urls = Urls(raw = String()),
            likes = photoAdapter.items[i].likes,
            liked_by_user = photoAdapter.items[i].likedByUser
        )
    }
}