public class Questions {

    String question;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    String correct;
    public Questions(String question, String answerA, String answerB, String answerC, String answerD, String correct)
    {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correct = correct;
    }
    public boolean checkAnswer(String answer){
        if (!answer.equals(correct)){
            return false;
        }
        else{
            return true;
        }
    }
    public void printQuestion (){
        System.out.println(question);
        System.out.println(answerA);
        System.out.println(answerB);
        System.out.println(answerC);
        System.out.println(answerD);
    }
    public String getQuestion (){
        return this.question;
    }
}
