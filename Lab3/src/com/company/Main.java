package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	boolean cont = true;
    Quiz quiz = new Quiz();
    while (cont == true){
        System.out.println("1. Add a question to the quiz\n" +
                "2. Remove a question from the quiz\n" +
                "3. Modify a question in the quiz\n" +
                "4. Take the quiz\n" +
                "5. Quit");
        switch (scan.nextInt()){
            case 1:
                quiz.add_question();
                break;
            case 2:
                quiz.remove_question();
                break;
            case 3:
                quiz.modify_question();
                break;
            case 4:
                quiz.give_quiz();
                break;
            case 5:
                cont = false;
                break;





        }
    }
    }
}
