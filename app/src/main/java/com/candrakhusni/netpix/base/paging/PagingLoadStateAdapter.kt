package com.candrakhusni.netpix.base.paging

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.candrakhusni.netpix.databinding.LayoutItemPagingLaodStateBinding
import com.candrakhusni.netpix.util.setVisible

class PagingLoadStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<PagingLoadStateAdapter.SubmissionsLoadStateViewHolder>() {

    inner class SubmissionsLoadStateViewHolder(
        private val binding: LayoutItemPagingLaodStateBinding,
        private val retry: () -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(loadState: LoadState) {
            if (loadState is LoadState.Error) {
                binding.textViewError.text = loadState.error.message ?: loadState.error.message
            }
            binding.pbLoader.setVisible(loadState is LoadState.Loading)
            binding.buttonRetry.setVisible(loadState is LoadState.Error)
            binding.textViewError.setVisible(loadState is LoadState.Error)
            binding.buttonRetry.setOnClickListener { retry() }
        }
    }

    override fun onBindViewHolder(holder: SubmissionsLoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState) = SubmissionsLoadStateViewHolder(
        LayoutItemPagingLaodStateBinding.inflate(LayoutInflater.from(parent.context), parent, false), retry
    )

}