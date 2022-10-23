package com.company;
import java.util.*;

public class Question {
    private String QuestionText;
    private String QuestionAnswer;
    private int Difficulty;
    Question(String QuestionTextInput, String QuestionAnswerInput, Integer DifficultyInput){
        QuestionText = QuestionTextInput;
        QuestionAnswer = QuestionAnswerInput;
        Difficulty = DifficultyInput;
    }
    String GetQuestionText(){
        return QuestionText;
    }
    String GetQuestionAnswer(){
        return QuestionAnswer;
    }
    int GetDifficulty(){
        return Difficulty;
    }
    Void SetQuestionText(String QuestionTextInput){
        QuestionText = QuestionTextInput;
        return null;
    }
    Void SetQuestionAnswer(String QuestionAnswerInput){
        QuestionAnswer = QuestionAnswerInput;
        return null;
    }
    Void SetQuestionDifficulty(int DifficultyInput){
        Difficulty = DifficultyInput;
        return null;
    }
}
