package ru.ktsstudio.lection3.utils

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PaginationScrollListener(
    private val layoutManager: LinearLayoutManager,
    private val requestNextItems: (Int) -> Unit,
    private val visibilityThreshold: Int = DEFAULT_VISIBILITY_THRESHOLD
) : RecyclerView.OnScrollListener() {
    var isLoading = true
    //var isLastPage = false
    private var pageCounter = 1

    override fun onScrolled(
        recyclerView: RecyclerView,
        dx: Int,
        dy: Int
    ) = with(layoutManager) {
        if (dy <= 0) return

        val scrolledOffItems = findFirstVisibleItemPosition()
        val visibleItems = childCount
        val itemsTotal = itemCount

        if (visibleItems + scrolledOffItems + visibilityThreshold >= itemsTotal) {
            requestNextItems.invoke(++pageCounter)
            isLoading = false
        }
    }
    companion object {
        private const val DEFAULT_VISIBILITY_THRESHOLD = 5
    }
}