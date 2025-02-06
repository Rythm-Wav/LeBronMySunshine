import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {

    @org.junit.jupiter.api.Test
    void checkAnswer() {
        Questions test1 = new Questions("How tall is Bo Jackson?","2ft 4in",
                "5ft 10in","6ft 3in","6ft 1in","D");
        assertTrue(test1.checkAnswer("D")==true);
    }

    @org.junit.jupiter.api.Test
    void printQuestion() {
    }
}