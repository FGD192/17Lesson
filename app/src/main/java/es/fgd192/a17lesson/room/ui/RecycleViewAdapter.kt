package es.fgd192.a17lesson.room.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.fgd192.a17lesson.R
import es.fgd192.a17lesson.room.data.DataClass

class RecycleViewAdapter() : RecyclerView.Adapter<RvViewHolder>() {

    private var data = arrayListOf<DataClass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return RvViewHolder(view)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(data[position])
    }

    fun update(data: List<DataClass>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }
}