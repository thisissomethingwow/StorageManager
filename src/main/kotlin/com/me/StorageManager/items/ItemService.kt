package com.me.StorageManager.items

import com.me.StorageManager.items.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class ItemService(@Autowired private val itemRepository: ItemRepository ) {

    fun getAllItems(): List<Item> {
        return itemRepository.findAll().toList()
    }


    fun addItem(item: Item): Item {
        return itemRepository.save(item)
    }
}