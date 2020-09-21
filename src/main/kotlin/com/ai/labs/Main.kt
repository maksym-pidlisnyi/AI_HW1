package com.ai.labs

import com.ai.labs.handlers.*
import edu.stanford.nlp.simple.*


fun main() {

//    var sentence = ""
//    while(true) {
//        sentence = readLine()!!
//        if(sentence == "bye") break
//        if(sentence != null && sentence.isNotBlank()) println(questionHandler(sentence))
//
//    }
//        var sentenceString = "Joe Smith was born in California."
//    var sentence = Sentence(sentenceString)
    var sentenceString = ""
    while(true) {
        println("Hello!")
        sentenceString = readLine().toString()
        if(sentenceString.contains("Bye")) {
            println("Bye)")
            break
        }
        var sentence = Sentence(sentenceString)
        val nerTags = sentence.nerTags()
        println(nerTags)
//        val posTags = sentence.posTags()
//        println(posTags)

        val people = sentence.words().zip(nerTags).filter { it.second == "PERSON" }.toMap().keys
        println("And what do you think about ${people.random()}?")

    }
//TODO()

}
