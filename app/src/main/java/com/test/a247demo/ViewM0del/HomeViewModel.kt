package com.test.a247demo.ViewM0del

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.a247demo.Repository.NetworkRepository
import com.test.a247demo.Model.Result


class HomeViewModel : ViewModel() {
    private var mutableLiveData: MutableLiveData<List<Result>>? = null

    fun getUser() : MutableLiveData<List<Result>>? {
        mutableLiveData = NetworkRepository.getUsersList()
        return mutableLiveData
    }
}