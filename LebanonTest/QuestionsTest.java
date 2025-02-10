import org.junit.jupiter.api.Test;
import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {
//String test 1
    @org.junit.jupiter.api.Test
    void checkAnswer() {
        Questions test1 = new Questions("How tall is Bo Jackson?","2ft 4in",
                "5ft 10in","6ft 3in","6ft 1in","D");
        assertTrue(test1.checkAnswer("D"));
    }
//String test 2
    @org.junit.jupiter.api.Test
    void printQuestion() {
        Questions test2 = new Questions("What ethnicity is LeBron", "A)African American","B)Puerto Rican", "C) Caucasian", "D)African","A");
        assertTrue(test2.getQuestion().matches("[A-Z][a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+(?)"));

    }
    //String test 3
    @org.junit.jupiter.api.Test
    void getQuestion(){
        Questions test3 = new Questions("How many kids does lebron have?","3","1","5","0","A");
        assertFalse(test3.getQuestion().matches("How many trophies does lebron have(?)"));
    }
    //String test 4
    @org.junit.jupiter.api.Test
    void getQuestion2(){
        Questions test4 = new Questions("","True","False","Trueer","Falsest","C");
        assertTrue(test4.getQuestion().matches(""));
    }
    //String test 5
    @org.junit.jupiter.api.Test
    void getCorrect(){
        Questions test5 = new Questions("LoremIpsum","True","False","Trueer","Falsest","C");
        assertTrue(test5.getCorrect().matches("C"));
    }
    //String test 6
    @org.junit.jupiter.api.Test
    void getAnswerB(){
        Questions test6 = new Questions("LoremIpsum","True","False","Trueer","Falsest","C");
        assertFalse(test6.getAnswerB().matches("True"));
    }
    //String test 7
    @org.junit.jupiter.api.Test
    void getAnswerC(){
        Questions test7 = new Questions("LoremIpsum","True","False","Trueer","Falsest","C");
        assertTrue(test7.getAnswerC().matches("Trueer"));
    }
    //String test 8
    @org.junit.jupiter.api.Test
    void checkAnswer2(){
        Questions test8 = new Questions("LoremIpsum","True","False","Trueer","Falsest","C");
        assertFalse(test8.checkAnswer("D"));
    }
    //String test 9
    @org.junit.jupiter.api.Test
    void getAnswerA2(){
        Questions test9 = new Questions("What is Bo Jackson's name","Bo Jackson","False","Trueer","Falsest","C");
        assertTrue(test9.getAnswerA().matches("[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*"));
    }
    //String test 10
    @org.junit.jupiter.api.Test
    void getCorrect2(){
        Questions test10 = new Questions("LoremIpsum","True","False","Trueer","Falsest","QWERTYUIOP");
        assertFalse(test10.getCorrect().matches("(A,B,C,D)"));
    }
    //Num test 1
    @org.junit.jupiter.api.Test
    void getAnswerA(){
        Questions test11 = new Questions("2?3?4?5?","2","3","4","5","A");
        assertTrue(test11.getAnswerA().matches("2"));
    }
    //Num test 2
    @org.junit.jupiter.api.Test
    void getAnswerD(){
        Questions test12 = new Questions("What is Lebron James's birthday?","07/18/1984","08/23/2001","11/11/1111","12/30/1984","C");
        assertTrue(test12.getAnswerD().matches("([1-9]|1[012])(/)[0-9]{2}(/)\\d{4}"));
    }
    //Num test 3
    @org.junit.jupiter.api.Test
    void getAnswerC2(){
        Questions test13 = new Questions("10r3m ip5um","13579","246810","102030405060","0","C");
        assertTrue(test13.getAnswerC().matches("\\d{12}"));
    }
    //Num test 4
    @org.junit.jupiter.api.Test
    void getQuestion3(){
        Questions test14 = new Questions("10r3m ip5um","13579","246810","102030405060","0","C");
        assertTrue(test14.getQuestion().matches("[\\d\\w]*\\s[\\d\\w]*"));
    }
    //Num test 5\
    @org.junit.jupiter.api.Test
    void printQuestion2(){
        Questions test15 = new Questions("1029384756","13579","246810","102030405060","0","C");
        assertFalse(test15.getQuestion().matches("[A-Z][a-zA-Z]*"));
    }
    //Num test 6
    @org.junit.jupiter.api.Test
    void getAnswerA3(){
        Questions test16 = new Questions("10r3m ip5um","13579","246810","102030405060","0","C");
        assertTrue(test16.getAnswerA().matches("\\d{5}"));
    }
    //Num test 7
    @org.junit.jupiter.api.Test
    void getAnswerD2(){
        Questions test17 = new Questions("10r3m ip5um","13579","246810","102030405060","0","C");
        assertTrue(test17.getAnswerD().matches("(0){1}"));
    }
    //Num test 8
    @org.junit.jupiter.api.Test
    void getAnswerB3(){
        Questions test18 = new Questions("10r3m ip5um","13579","246810","102030405060","0","C");
        assertFalse(test18.getAnswerB().matches("(246728736)*\\s\\d."));
    }
    //Num test 9
    @org.junit.jupiter.api.Test
    void getQuestion4(){
        Questions test19 = new Questions("12456789","13579","246810","102030405060","0","C");
        assertFalse(test19.getQuestion().matches("(1234567898)"));
    }
    //Num test 10
    @org.junit.jupiter.api.Test
    void getCorrect3(){
        Questions test20 = new Questions("10r3m ip5um","13579","246810","102030405060","0","102030405060");
        assertFalse(test20.getCorrect().matches("[A-Z]{1}"));
    }
}