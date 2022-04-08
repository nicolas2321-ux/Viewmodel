package com.orellana.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var query = MutableLiveData("")
    var result = Transformations.map(query){ query ->
        if(query.isEmpty())
            "por favor ingrese algo"
        else
            "Este es el resultado de la busqueda usando el ${query}"
    }

    fun onSearch(){


    }
}