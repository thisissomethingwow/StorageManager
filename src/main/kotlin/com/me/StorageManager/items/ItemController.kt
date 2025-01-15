package com.me.StorageManager.items

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/item")
@CrossOrigin
class ItemController(@Autowired private val itemService: ItemService) {

    @GetMapping
    fun getAllItems():List<Item> = itemService.getAllItems()

    @PostMapping
    fun addItem(@RequestBody item: Item): Item{
        return itemService.addItem(item)
    }

    @PutMapping("/{id}")
    fun updateItem(@PathVariable id:Long,@RequestBody item: Item): ResponseEntity<Item> {
        return ResponseEntity.ok((itemService.updateItem(id,item)))
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Long){
        return itemService.deleteItem(id)
    }
}