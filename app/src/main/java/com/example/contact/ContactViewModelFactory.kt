package com.example.contact

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.data.ContactDAO

class ContactViewModelFactory(
    private val dataSource: ContactDAO,
    private val application: Application
) : ViewModelProvider.Factory {

    @Suppress("Unchecked")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ContactViewModel::class.java)){
            return ContactViewModel(dataSource,application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}