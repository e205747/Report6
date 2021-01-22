package jp.ac.uryukyu.ie.e205747;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {
    @Test
    void userInputTest(){
        int[] xy = new UserInput().UserInput();
        assertEquals(xy.length, 2);
    }
    
}