package session21.ex1quiz;

public class Question {
    private String question,answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public void askQuestion(){
        System.out.println(question + "\nEnter the answer:");
    }

    public boolean checkAnswer(String userAnswer){
        if(this.answer.equalsIgnoreCase(userAnswer)) return true;
        return false;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
