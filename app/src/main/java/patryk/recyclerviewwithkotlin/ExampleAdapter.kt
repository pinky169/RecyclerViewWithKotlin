package patryk.recyclerviewwithkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(val exampleData: List<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = exampleData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(exampleData[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.image_view
        val text1: TextView = itemView.text_view_1
        val text2: TextView = itemView.text_view_2

        fun bind(item: ExampleItem) {
            image.setImageResource(item.imageResource)
            text1.text = item.text1
            text2.text = item.text2
        }
    }
}