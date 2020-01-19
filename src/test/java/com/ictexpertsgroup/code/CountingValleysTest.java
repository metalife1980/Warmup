package  com.ictexpertsgroup.code;

import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.css.Counter;
//import static org.junit.jupiter.api.Assertions.*;
//import static  org.junit.jupiter.api.Test;

public class CountingValleysTest {

//    @org.junit.jupiter.api.Test

    @Test
   public void countingValleys() {
        CountingValleys countingValleys=new CountingValleys();
        int r=countingValleys.countingValleys(8,"UDDDUDUU");
        assertEquals(1, r);
    }

}