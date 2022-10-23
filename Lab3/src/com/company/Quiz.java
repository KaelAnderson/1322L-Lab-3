package com.company;
import java.util.*;
public class Quiz {
    private String QuestionTextInput;
    private String QuestionAnswerInput;
    private int DifficultyInput;
    Scanner Scan = new Scanner(System.in);
    public ArrayList<Question> quiz = new ArrayList<>();
    Void add_question(){
        System.out.println("What is the question Text?");
        QuestionTextInput = Scan.next();
        System.out.println("What is the answer?");
        QuestionAnswerInput = Scan.next();
        System.out.println("How Difficult (1-3)?");
        DifficultyInput = Scan.nextInt();
        quiz.add(new Question(QuestionTextInput,QuestionAnswerInput,DifficultyInput));
        return null;
    }
    Void remove_question(){
        System.out.println("Choose the question to remove?");
        Iterator<Question> itr=quiz.iterator();
        int i = 0;
        while(itr.hasNext()){

            i++;
            System.out.println(i + ". " + itr.next().GetQuestionText());

        }
        quiz.remove(Scan.nextInt() - 1);
        return null;
    }
    Void modify_question(){
        System.out.println("Choose the question to modify?");

        Iterator<Question> itr=quiz.iterator();
        int i = 0;
        while(itr.hasNext()){

            i++;
            System.out.println(i + ". " + itr.next().GetQuestionText());

        }
        int input = Scan.nextInt();
        System.out.println("What is the question Text?");
        QuestionTextInput = Scan.next();
        System.out.println("What is the answer?");
        QuestionAnswerInput = Scan.next();
        System.out.println("How Difficult (1-3)?");
        DifficultyInput = Scan.nextInt();
        Question Quest = new Question(QuestionTextInput,QuestionAnswerInput,DifficultyInput);
        quiz.set(input - 1,Quest);
        return null;
    }
    Void give_quiz(){
        Iterator<Question> itr=quiz.iterator();

        int correct = 0;
        int total = 0;
        int i = -1;
        while(itr.hasNext()){

            i++;
            System.out.println(itr.next().GetQuestionText());
            String s1 = Scan.next();
            String s2 = quiz.get(i).GetQuestionAnswer();
            if(Objects.equals(s1,s2)){
                System.out.println("Correct");
                correct++;
            }else {
                System.out.println("Incorrect");

            }
            total++;
        }
        System.out.println("You got " + correct + " out of " + total);

        return null;
    }
}
