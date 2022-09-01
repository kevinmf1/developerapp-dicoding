package com.kevinmalikfajar.jobview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.kevinmalikfajar.jobview.R

class JobListAdapter : RecyclerView.Adapter<JobListAdapter.ViewHolder>() {

    private var listData = ArrayList<Job>()
    var onItemClick: ((Job) -> Unit)? = null

    fun setData(data: List<Job>) {
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val imageView: ImageView = itemView.findViewById(R.id.img_job)
        private val title: TextView = itemView.findViewById(R.id.tv_job_title)
        private val px = dpToPx(itemView.context, 16f)

        fun bind(data: Job) {
            Glide.with(itemView.context)
                .load(data.image)
                .transform(CenterCrop(), RoundedCorners(px.toInt()))
                .into(imageView)
            title.text = data.title
        }

        init {
            itemView.rootView.setOnClickListener{
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    fun dpToPx(context: Context, dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }
}