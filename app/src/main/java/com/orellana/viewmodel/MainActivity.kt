package com.orellana.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.google.android.material.textfield.TextInputLayout
import com.orellana.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //instancia de elemento
    private val viewModel:MainViewModel by viewModels()
//
//    private lateinit var queryEditText : EditText
//    private lateinit var searchBtn: Button
//    private lateinit var resultText: TextView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewModel = viewModel
//        bind()
        binding.lifecycleOwner= this
//        resultText.text = viewModel.result
        binding.actionSearch.setOnClickListener(){
            viewModel.onSearch()

        }
    }
    //ext{
    //    activity_version = "1.4.0"
    //} esto se pone en el archivo build.gradle viewmodel
    // implementation "androidx.activity:activity-ktx:$activity_version" esto se pone en
    //build gradle app

    //datavinding para activarla se va a builda gradle de module
    //debajo de android se escribe buildFeatures{dataBinding true}
    //se pone <layout></Layout> en el xml


//    private fun bind(){
//        val queryTextInputLayout:TextInputLayout    = findViewById(R.id.query_edit_text)
//        queryEditText = queryTextInputLayout.editText!!
//        searchBtn = findViewById(R.id.action_search)
//        resultText = findViewById(R.id.result_text)
//    }
}