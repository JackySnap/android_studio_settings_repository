
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

#parse("File Header.java")
class ${NAME}(private val data: ArrayList<${MODEL}Item>, private val on${MODEL}Listener: On${MODEL}Listener) :
    RecyclerView.Adapter<${MODEL}Adapter.Viewholder>() {
    private var model: ${MODEL}Item? = null

    class Viewholder(itemView: View, on${MODEL}Listener: On${MODEL}Listener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        // 1. Declare your Views here

     

        var on${MODEL}Listener: On${MODEL}Listener

        init {

            // 2. Define your Views here


            this.on${MODEL}Listener = on${MODEL}Listener
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            on${MODEL}Listener.on${MODEL}Click(adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.${LAYOUT_ITEM_XML}, parent, false)

        return Viewholder(itemView, on${MODEL}Listener)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        model = data[position]

        // 3. set the data to your Views here

 
        /**
         *
         * The format to set data should be like this example:
         * --------------------------------------
         * holder.txvName.setText(model.getName());
         *
         */

    }

    override fun getItemCount(): Int = data.size

    interface On${MODEL}Listener {
        fun on${MODEL}Click(position: Int)
    }

}
