package com.example.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDAO {
    @Insert
    fun insertName(contact:Contact)

    @Query("SELECT * FROM contact_table ORDER BY contactId DESC")
    fun getName(): LiveData<List<Contact>>
}