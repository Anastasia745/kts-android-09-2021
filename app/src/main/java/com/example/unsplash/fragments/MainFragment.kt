package com.example.unsplash.fragments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.unsplash.viewModel.MainViewModel
import com.example.unsplash.R
import com.example.unsplash.databinding.FragmentMainBinding
import com.example.unsplash.networking.data.CollectionViewModel
import com.example.unsplash.networking.adapter.CollectionsAdapter
import com.example.unsplash.networking.adapter.PhotoAdapter
import ru.ktsstudio.lection3.utils.PaginationScrollListener
import ru.ktsstudio.lection3.utils.autoCleared

class MainFragment : Fragment(R.layout.fragment_main) {
    private val viewModel: MainViewModel by viewModels()
    private val collectionViewModel: CollectionViewModel by viewModels()
    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)
    private var photoAdapter: PhotoAdapter by autoCleared()
    private var collectionsAdapter: CollectionsAdapter by autoCleared()

    private lateinit var paginationScrollListener: PaginationScrollListener

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initList()
        bindViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        view.findViewById<Button>(R.id.buttonPhotosList).setOnClickListener {
            initList()
            bindViewModel()
        }
        view.findViewById<Button>(R.id.buttonCollectionsList).setOnClickListener {
            initListCollections()
            bindViewModelCollections()
        }
        return view
    }

    private fun initList() {
        photoAdapter = PhotoAdapter {
            viewModel.likePhoto(it)
        }
        with(binding.list) {
            val orientation = RecyclerView.VERTICAL
            adapter = photoAdapter
            layoutManager = LinearLayoutManager(context, orientation, false)
            paginationScrollListener = PaginationScrollListener(
                layoutManager = layoutManager as LinearLayoutManager,
                requestNextItems = { viewModel.getNewItems(it) },
                visibilityThreshold = 0
            )
            addOnScrollListener(
                paginationScrollListener
            )
            addItemDecoration(DividerItemDecoration(context, orientation))
            setHasFixedSize(true)
        }
    }

    private fun initListCollections() {
        collectionsAdapter = CollectionsAdapter()
        with(binding.list) {
            val orientation = RecyclerView.VERTICAL
            adapter = collectionsAdapter
            layoutManager = LinearLayoutManager(context, orientation, false)
            paginationScrollListener = PaginationScrollListener(
                layoutManager = layoutManager as LinearLayoutManager,
                requestNextItems = { collectionViewModel.getNewCollections(it) },
                visibilityThreshold = 0
            )
            addOnScrollListener(
                paginationScrollListener
            )
            addItemDecoration(DividerItemDecoration(context, orientation))
            setHasFixedSize(true)
        }
    }

    private fun bindViewModel() {
        viewModel.photosLiveData.observe(viewLifecycleOwner, Observer { photoAdapter.items = it })
        viewModel.changePhotosLiveData.observe(viewLifecycleOwner, Observer {
            photoAdapter.notifyItemChanged(it[0], listOf(it[1]))
        })
    }

    private fun bindViewModelCollections() {
        collectionViewModel.collectionsLiveData.observe(viewLifecycleOwner, Observer { collectionsAdapter.items = it })
        collectionViewModel.changeCollectionsLiveData.observe(viewLifecycleOwner, Observer {
            collectionsAdapter.notifyItemChanged(it[0], listOf(it[1]))
        })
    }
}