package com.example.homework4java5.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4java5.data.model.CharactersItem
import com.example.homework4java5.databinding.ItemCharacterBinding

class CharacterAdapter {
    class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

        private var characterList = listOf<CharactersItem>()

        fun setCharacter(_characterList: List<CharactersItem>) {
            this.characterList = _characterList
            notifyDataSetChanged()
        }

        inner class CharacterViewHolder(private val binding: ItemCharacterBinding) :
            RecyclerView.ViewHolder(binding.root) {

            fun onBind(charactersItem: CharactersItem) = with(binding) {
                textItem.text = charactersItem.nickname

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
            val binding =
                ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return CharacterViewHolder(binding)
        }

        override fun getItemCount() = characterList.size

        override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
            holder.onBind(characterList[position])
        }
    }
}