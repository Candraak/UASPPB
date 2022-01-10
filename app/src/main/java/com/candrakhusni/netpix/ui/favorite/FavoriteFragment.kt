package com.candrakhusni.netpix.ui.favorite

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.candrakhusni.netpix.base.BaseFragment
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.databinding.FragmentFavoriteBinding
import com.candrakhusni.netpix.ui.detail.DetailActivity
import com.candrakhusni.netpix.ui.favorite.adapter.FavoriteAdapter
import com.candrakhusni.netpix.util.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber
import kotlin.text.orEmpty

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {
    override val viewModel: FavoriteViewModel by viewModel()
    private lateinit var adapter: FavoriteAdapter
    private lateinit var database: DatabaseReference

    override fun getBinding(
        layoutInflater: LayoutInflater,
        viewGroup: ViewGroup?,
        savedInstanceState: Boolean?,
    ) = FragmentFavoriteBinding.inflate(layoutInflater, viewGroup, false)


    override fun setupViews() {
        val gridLayoutManager = GridLayoutManager(requireContext(), 1)
        binding.rvOrder.layoutManager = gridLayoutManager
        binding.rvOrder.addItemDecoration(GridMarginItemDecoration(30))
        database =
            Firebase.database("https://netpix-abdul-default-rtdb.asia-southeast1.firebasedatabase.app").reference
        val myMostViewedPostsQuery = database.child("movie")
        myMostViewedPostsQuery.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val list = mutableListOf<ResultsItem>()
                for (movie in dataSnapshot.children) {
                    val item = movie.getValue(ResultsItem::class.java)
                    if (item != null) {
                        list.add(item)
                    }
                }
                viewModel.list.postValue(list)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Timber.d(databaseError.toException())
                requireContext().toast(databaseError.message)
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setupList(list: List<ResultsItem>) {
        adapter = FavoriteAdapter(list, { data ->
            DetailActivity.startPage(requireActivity(), data)
        }, { data ->
            database.child("movie").child(data.title.orEmpty()).setValue(null)
            requireContext().toast("Sukses Menghapus Film")
            adapter.notifyDataSetChanged()
        })
        binding.rvOrder.adapter = adapter
    }

    override fun setupListeners() {}

    override fun setupObservers() {
        observe(viewModel.list) { list ->
            if (list.isNotEmpty()) {
                binding.rvOrder.visible()
                binding.pbLoader.gone()
                binding.tvEmpty.gone()
                setupList(list)
            } else {
                binding.rvOrder.gone()
                binding.pbLoader.gone()
                binding.tvEmpty.visible()
            }
        }
    }

}