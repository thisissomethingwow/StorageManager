package com.me.StorageManager.items

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ItemService(@Autowired private val itemRepository: ItemRepository ) {

    fun getAllItems(): List<Item> {
        return itemRepository.findAll().toList()
    }


    fun addItem(item: Item): Item {
        return itemRepository.save(item)
    }


    fun updateItem(id:Long,updatedItem: Item): Item? {
        val itemToUpdateOptional: Optional<Item> = itemRepository.findById(id)
        if (itemToUpdateOptional.isPresent){
            val itemToUpdate: Item = itemToUpdateOptional.get()
            itemToUpdate.name = updatedItem.name
            itemToUpdate.amount = updatedItem.amount
            return itemRepository.save(itemToUpdate)
        }
        return null
    }



}