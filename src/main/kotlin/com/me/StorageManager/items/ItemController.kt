package com.me.StorageManager.items

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/item")
@CrossOrigin
class ItemController(@Autowired private val itemService: ItemService) {

    @GetMapping
    fun getAllItems():List<Item> = itemService.getAllItems()

    @PostMapping
    fun addItem(item: Item): Item{
        return itemService.addItem(item)
    }
}