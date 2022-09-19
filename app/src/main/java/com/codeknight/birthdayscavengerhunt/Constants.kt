package com.codeknight.birthdayscavengerhunt

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question (
            "We're finally going to watch this movie",
            "Roland really wants to watch this",
            "Had a hell of a time finally getting it",
            "9675"
        )

        val que2 = Question (
            "Olive has beef with this thing for some reason...",
            "He really put it in time out",
            "Skeletal Equestrian",
            "1310"
        )

        val que3 = Question (
            "\"This is my last run and then I swear we're going to bed\"",
            "Melina's life mission for a couple months",
            "Can`t sit too far away",
            "7227"
        )

        val que4 = Question (
            "Roland eventually needs to get a shelf for these...",
            "This spot will do for now.",
            "These don't look like clothes!",
            "5059"
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)

        return questionsList
    }
}