package com.sample.practical.view.home.adapter

import android.view.View
import com.sample.practical.R
import com.sample.practical.base.BaseRecyclerAdapter
import com.sample.practical.databinding.ItemAlbumBinding
import com.sample.practical.model.AlbumData
import com.sample.practical.utils.IAdapterOnClick


class AlbumAdapter(private val listener: IAdapterOnClick) :
    BaseRecyclerAdapter<AlbumData>() {
    override fun getLayoutIdForType(viewType: Int): Int {
        return R.layout.item_album
    }


    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        (binding as ItemAlbumBinding).ivArticleImage.setOnClickListener(holder)
    }


    override fun areItemsSame(
        oldItem: AlbumData,
        newItem: AlbumData
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun onItemClick(view: View?, item: AlbumData, adapterPosition: Int) {
        listener.onClick(view, item, adapterPosition)
    }

    override fun areContentsTheSame(
        oldItem: AlbumData,
        newItem: AlbumData
    ): Boolean {
        return oldItem.id == newItem.id
    }
}