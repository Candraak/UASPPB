package com.candrakhusni.netpix.ui.detail

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import coil.load
import com.candrakhusni.netpix.base.BaseActivity
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.databinding.ActivityDetailBinding
import com.candrakhusni.netpix.util.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.text.orEmpty

class DetailActivity : BaseActivity<ActivityDetailBinding, DetailViewModel>() {

    override val viewModel: DetailViewModel by viewModel()
    private lateinit var database: DatabaseReference

    override fun getBinding(layoutInflater: LayoutInflater) =
        ActivityDetailBinding.inflate(layoutInflater)

    override fun setupViews() {
        database =
            Firebase.database("https://netpix-abdul-default-rtdb.asia-southeast1.firebasedatabase.app").reference
        getIntentData()
        initView()
    }

    private fun initView() = with(binding) {
        btnBack.onThrottledClick {
            onBackPressed()
        }
        btnAdd.onThrottledClick {
            it.invisible()
            btnSave.visible()
            tilNote.visible()
        }
        btnSave.onThrottledClick {
            saveFavorite()
            btnAdd.visible()
            tilNote.gone()
            btnSave.gone()
            toast("Sukses Menambahkan Favorite")
        }

    }

    private fun saveFavorite() {
        val notes = binding.tilNote.editText?.text.toString()
        val movie = viewModel.movieData.value?.copy(isFavorite = true, notes = notes)
        database.child("movie").child(movie?.title.orEmpty()).setValue(movie)
    }

    private fun getIntentData() {
        if (intent.hasExtra(EXTRA_DATA)) {
            viewModel.movieData.postValue(intent.getParcelableExtra(EXTRA_DATA))
        }
    }

    override fun setupListeners() {

    }

    @SuppressLint("SetTextI18n")
    override fun setupObservers() {
        with(binding) {
            observe(viewModel.movieData) { movie ->
                ivPoster.load(movie?.posterPath)
                content.tvTitle.text = movie?.title
                content.tvSubTitle.text = "${movie?.releaseDate} • ${movie?.originalLanguage}"
                content.ratingBar.rating = movie?.voteAverage?.div(2)?.toFloat() ?: 0f
                content.tvRatingCount.text = content.ratingBar.rating.toString()
                tvSynopsis.text = movie?.overview
            }
        }
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
        fun startPage(activity: Activity, data: ResultsItem) {
            Intent(activity, DetailActivity::class.java).let {
                it.putExtra(EXTRA_DATA, data)
                activity.startActivity(it)
            }
        }
    }

}