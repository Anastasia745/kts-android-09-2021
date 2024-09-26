package com.example.unsplash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.unsplash.databinding.FragmentMainBinding
import ru.ktsstudio.lection3.utils.autoCleared
import timber.log.Timber

class Main : Fragment(R.layout.fragment_main) {

    val defaultItems = List(20) {
        ItemMain(
            imgId = R.drawable.img1,
            author = "Автор: Гнибеда Анастасия",
            like_count = 100,
        )
    }

    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)
    private var mainAdapter: MainAdapter by autoCleared()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        setDefaultItems()
    }

    private fun initList() {
        mainAdapter = MainAdapter()
        with(binding.list) {
            val orientation = RecyclerView.VERTICAL
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context, orientation, false)
            addItemDecoration(DividerItemDecoration(context, orientation))
            setHasFixedSize(true)
        }
    }

    private fun setDefaultItems() {
        mainAdapter.setItems(defaultItems)
    }
}