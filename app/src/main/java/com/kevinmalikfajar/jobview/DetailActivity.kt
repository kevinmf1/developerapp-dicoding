package com.kevinmalikfajar.jobview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.davidnasrulloh.jobview.R

class DetailActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var title: TextView
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imageView = findViewById(R.id.detail_img_job)
        title = findViewById(R.id.detail_tv_title)
        description = findViewById(R.id.detail_tv_description)

        val intentData = intent.getParcelableExtra<Job>(EXTRA_DATA)

        if (intentData != null) {
            supportActionBar?.title = intentData.title
            showList(intentData)
        }

    }

    fun showList(data: Job) {
        val px = dpToPx(this@DetailActivity, 16f)
        Glide.with(this)
            .load(data.image)
            .transform(CenterCrop(), RoundedCorners(px.toInt()))
            .into(imageView)
        title.text = data.title
        description.text = data.description

    }

    fun dpToPx(context: Context, dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
    }
}