package com.example.chapter2

import android.app.Application
import androidx.room.Room
import com.example.chapter2.data.AppDatabase

class Chapter2Application: Application() {
    @Override
    override fun onCreate() {
        super.onCreate()

        val dataBase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "product-data"
        ).build()
    }
}