package com.example.helloworldk

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import kotlinx.android.synthetic.main.entry_something.view.*


@EpoxyModelClass(layout = R.layout.entry_something)
abstract class EntryModel : EpoxyModelWithHolder<EntryModel.EntryHolder>() {
    @EpoxyAttribute
    var name: CharSequence? = ""

    override fun bind(holder: EntryHolder) {
        holder.entryName.text = name
    }

    inner class EntryHolder : EpoxyHolder() {
        lateinit var entryName: TextView

        override fun bindView(itemView: View) {
            entryName = itemView.enterSomething
        }
    }
}
