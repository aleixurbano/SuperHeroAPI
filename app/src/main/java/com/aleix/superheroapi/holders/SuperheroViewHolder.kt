package com.aleix.superheroapi.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aleix.superheroapi.databinding.ItemSuperheroBinding
import com.aleix.superheroapi.entity.SuperheroItemResponse
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected: (String) -> Unit) {
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
    }
}