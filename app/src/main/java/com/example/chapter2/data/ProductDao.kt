package com.example.chapter2.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM Product")
    fun getAll(): List<Product>

    @Query("SELECT * FROM Product WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Product>

    @Query("SELECT * FROM Product WHERE name LIKE :name")
    fun findByName(name: String): Product

    @Insert
    fun insertAll(vararg users: Product)

    @Delete
    fun delete(product: Product)
}