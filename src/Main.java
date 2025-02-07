import java.util.Scanner;
//Scanner key = new Scanner(System.in);
//Reply = key.nextLine();
public class Main {
    public static void main(String[] args) {
        String Reply;
        System.out.println("Welcome to the Lebron James Quiz!!");
        Scanner key = new Scanner(System.in);
        do {
            Questions Q1 = new Questions("1) What position did LeBron play in his sophomore year of high school?",
                    "A) Linebacker", "B) Wide Receiver", "C) Center", "D) Fullback", "B");
            Q1.printQuestion();
            Reply = key.nextLine();

            if (!Reply.equals("B")){
                System.out.println("AIRBALL, try again.");
            }

        }
        while (!Reply.equals("B"));

        System.out.println("THREEEE You're right!\n Next question!");

        do {
            Questions Q2 = new Questions("2) How many more championships has LeBron won than Bo Jackson?",
                    "A) 1", "B) 7", "C) 4", "D) 2", "B");
            Q2.printQuestion();
            Reply = key.nextLine();

            if (!Reply.equals("C")){
                System.out.println("AIRBALL, try again.");
            }

        }
        while (!Reply.equals("C"));

        System.out.println("THREEEE You're right!");

        do {
            Questions Q3 = new Questions("3) How tall is Bo Jackson?",
                    "A) 6ft 5in", "B) 6ft 1in", "C) 5ft 9in", "D) 6ft 3in", "B");
            Q3.printQuestion();
            Reply = key.nextLine();

            if (!Reply.equals("B")){
                System.out.println("AIRBALL, try again.");
            }

        }
        while (!Reply.equals("B"));

        System.out.println("THREEEE You're right!");
        do {
            Questions Q1 = new Questions("4) What is LeBron's theme song?",
                    "A) Sunshine", "B) Mr. Bluesky", "C) I'm the Man ", "D) Viva La Vida ", "A");
            Q1.printQuestion();
            Reply = key.nextLine();

            if (!Reply.equals("A")){
                System.out.println("AIRBALL, try again.");
            }

        }
        while (!Reply.equals("A"));

        System.out.println("THREEEE You're right!");

        do {
            Questions Q5 = new Questions("What position did LeBron play in his sophomore year of high school?",
                    "A) Linebacker", "B) Wide Receiver", "C) Center", "D) Fullback", "B");
            Q5.printQuestion();
            Reply = key.nextLine();

            if (!Reply.equals("B")){
                System.out.println("AIRBALL, try again.");
            }

        }
        while (!Reply.equals("B"));

        System.out.println("THREEEE You're right!");

        System.out.println("Thanks for playing, you're a real LeBron fan!");
    }

}

