package com.candrakhusni.netpix.ui.explore.paging

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.databinding.LayoutItemDiscoveryBinding
import com.candrakhusni.netpix.util.loadImage
import com.candrakhusni.netpix.util.onThrottledClick
import timber.log.Timber

class ExploreListAdapter(private val onItemClick: (ResultsItem) -> Unit) :
    PagingDataAdapter<ResultsItem, ExploreListAdapter.OrdersViewHolder>(OrdersComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {
        return OrdersViewHolder(LayoutItemDiscoveryBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {
        val item = getItem(position)
        item?.let { holder.bindView(it) }
    }

    inner class OrdersViewHolder(private val binding: LayoutItemDiscoveryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindView(itemData: ResultsItem) = with(binding) {
            ivPoster.load(itemData.posterPath){
                crossfade(true)
                crossfade(500)
                transformations(RoundedCornersTransformation(25f))
            }
            tvTitle.text = itemData.title.orEmpty()
            root.onThrottledClick {
                onItemClick.invoke(itemData)
            }
        }
    }

    private object OrdersComparator : DiffUtil.ItemCallback<ResultsItem>() {
        override fun areItemsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean {
            return oldItem.overview == newItem.overview
        }
    }

}