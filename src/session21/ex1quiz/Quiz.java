package session21.ex1quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private static Scanner input = new Scanner(System.in);

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(String question, String answer) {
        questions.add(new Question(question, answer));
    }

    public void play() {

        int score = 0;

        for (Question each : questions) {
            each.askQuestion();
            String userAnswer = input.nextLine();
            if (each.checkAnswer(userAnswer)) {

                score += 10;
                System.out.println("Answer is correct and you save 10 points.");
            } else {
                System.out.println("Answer is not correct. Correct answer is " + each.getAnswer());
            }

        }
        System.out.println("The quiz is over and your total score is " + score);
    }

}
