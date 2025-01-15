package com.me.StorageManager.items

import jakarta.persistence.*


@Entity
class Item (@Id
            @SequenceGenerator(name = "item_sequence", sequenceName = "item_sequence", allocationSize = 1, initialValue = 1)
            @GeneratedValue(generator = "item_sequence")
            var id: Long = 0,
            var name: String = "",
            var amount: Int = 0
)
