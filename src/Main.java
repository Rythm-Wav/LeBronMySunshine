import java.util.Scanner;
//Scanner key = new Scanner(System.in);
//Reply = key.nextLine();
public class Main {
    public static void main(String[] args) {
        String Reply;
        System.out.println("Welcome to the Lebron James Quiz!!");
        Scanner key = new Scanner(System.in);
        do {
            Questions Q1 = new Questions("What position did LeBron play in his sophomore year of high school?",
                    "A) Linebacker", "B) Wide Receiver", "C) Center", "D) Fullback", "B");
            Q1.printQuestion();
            Reply = key.nextLine();
        }
        while (!Reply.equals("B"));



    }
}

