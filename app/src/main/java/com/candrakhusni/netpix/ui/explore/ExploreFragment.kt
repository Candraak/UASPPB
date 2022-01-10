package com.candrakhusni.netpix.ui.explore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import com.candrakhusni.netpix.base.BaseFragment
import com.candrakhusni.netpix.base.paging.PagingLoadStateAdapter
import com.candrakhusni.netpix.databinding.FragmentDiscoveryBinding
import com.candrakhusni.netpix.ui.detail.DetailActivity
import com.candrakhusni.netpix.ui.explore.paging.ExploreListAdapter
import com.candrakhusni.netpix.util.setVisible
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExploreFragment : BaseFragment<FragmentDiscoveryBinding, ExploreViewModel>() {
    override val viewModel: ExploreViewModel by viewModel()
    private lateinit var movieAdapter: ExploreListAdapter

    override fun getBinding(
        layoutInflater: LayoutInflater,
        viewGroup: ViewGroup?,
        savedInstanceState: Boolean?,
    ) = FragmentDiscoveryBinding.inflate(layoutInflater, viewGroup, false)


    override fun setupViews() {
        setupList()
    }

    private fun setupList() {
        movieAdapter = ExploreListAdapter { data ->
            DetailActivity.startPage(requireActivity(), data)
        }
        binding.rvOrder.apply {
            adapter = movieAdapter.withLoadStateHeaderAndFooter(
                header = PagingLoadStateAdapter { movieAdapter.retry() },
                footer = PagingLoadStateAdapter { movieAdapter.retry() }
            )
            setHasFixedSize(true)
        }
        viewModel.movieList().observe(viewLifecycleOwner) {
            movieAdapter.submitData(viewLifecycleOwner.lifecycle, it)
        }
        lifecycleScope.launch {
            movieAdapter.loadStateFlow.collectLatest { loadState ->
                binding.rvOrder.setVisible(movieAdapter.itemCount > 0)
                if (loadState.refresh is LoadState.Loading) binding.rvOrder.scrollToPosition(0)
            }
        }
    }

    override fun setupListeners() {}

    override fun setupObservers() {
    }

}