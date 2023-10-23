package com.art.architecturasmvvm.model

import com.art.architecturasmvvm.R

// El provider de datos

class QuoteProvider {
    companion object {

        // función para devolver quote random
        fun random(): QuoteModel {
            val position = (0..9).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                "The best way to predict the future is to invent it", "Alan Kay"
            ),
            QuoteModel(
                "Things work out best for those who make the best of how things work out",
                "John Wooden"
            ),
            QuoteModel("To live a creative life, we must lose our fear of being wrong", "-"),
            QuoteModel(
                "If you are not willing to risk the usual you will have to settle for the ordinary",
                "-"
            ),
            QuoteModel(
                "Trust because you are willing to accept the risk, not because it is safe or certain",
                "Jim Rohn"
            ),
            QuoteModel("Eighty percent of success is showing up", "Woody Allen"),
            QuoteModel(
                "I have not failed. I have just found 10,000 ways that will not work",
                "Thomas A. Edison"
            ),
            QuoteModel("If you do what you always did, you will get what you always got", "-"),
            QuoteModel(
                "Success is walking from failure to failure with no loss of enthusiasm",
                "Winston Churchill"
            ),
            QuoteModel("If opportunity does not knock, build a door", "-"),
        )
    }
}