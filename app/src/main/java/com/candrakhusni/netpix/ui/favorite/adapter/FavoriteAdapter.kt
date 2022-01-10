package com.candrakhusni.netpix.ui.favorite.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.databinding.LayoutItemFavoriteBinding
import com.candrakhusni.netpix.util.onThrottledClick

class FavoriteAdapter(
    private val listData: List<ResultsItem>,
    private val onItemClick: (ResultsItem) -> Unit,
    private val onItemDelete: (ResultsItem) -> Unit,
) : RecyclerView.Adapter<FavoriteAdapter.MissionAdapter>() {

    override fun getItemCount() = listData.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MissionAdapter(
        LayoutItemFavoriteBinding.inflate(LayoutInflater.from(parent.context))
    )

    override fun onBindViewHolder(holder: MissionAdapter, position: Int) {
        val item = listData[position]
        item.let { holder.bindView(it) }
    }

    inner class MissionAdapter(private val binding: LayoutItemFavoriteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(data: ResultsItem) = with(binding) {
            root.onThrottledClick {
                onItemClick(data)
            }
            btnDelete.onThrottledClick {
                onItemDelete(data)
            }
            ivPoster.load(data.posterPath) {
                transformations(RoundedCornersTransformation(16f))
            }
            tvTitle.text = data.title
            tvSynopsis.text = data.notes
            tvRatingCount.text =
                (data.voteAverage?.div(2)?.toFloat() ?: 0f.toString() + "/5").toString()
        }
    }

}
