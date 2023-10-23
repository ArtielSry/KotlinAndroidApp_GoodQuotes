package com.art.architecturasmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.art.architecturasmvvm.model.QuoteModel
import com.art.architecturasmvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    // El live data:
    val quoteModel = MutableLiveData<QuoteModel>()

    // Funcion que devuelve frase random
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()

        // A nuestro quoteModel le actualizamos el valor a currentQuote
        quoteModel.postValue(currentQuote)
    }
}