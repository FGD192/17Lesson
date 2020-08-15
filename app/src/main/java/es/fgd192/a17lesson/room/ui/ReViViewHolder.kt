package es.fgd192.a17lesson.room.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import es.fgd192.a17lesson.room.data.DataClass
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class RvViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(
        item: DataClass
    ) {
        itemView.TeVi.text = item.ETone
        itemView.TeVi2.text = item.ETtwo
    }
}