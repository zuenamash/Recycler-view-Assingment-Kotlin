package zuu.com.recyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerView(var fibonacci:List<Int>) :
    RecyclerView.Adapter<NumbersRecyclerView.NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):NumbersViewHolder {
        var itemView =LayoutInflater.from(parent.context)
            .inflate(R.layout.number_layout,parent,false)
        return NumbersViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvLayout.toString()

    }

    override fun getItemCount(): Int {
        return fibonacci.size

    }
    class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvLayout =itemView.findViewById<TextureView>(R.id.tvLayout)
    }
}
