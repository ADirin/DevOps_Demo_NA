import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyappTest {
    Myapp m = new Myapp();
   @Test
    public void addMe() {
       assertEquals(4,m.addMe(1,3));
    }

   @Test
    public void subMe() {

       assertEquals(2,m.subMe(3,1));
    }

    @Test
    public void mulMe() {
    assertEquals(6,m.mulMe(2,3));
    }

    @Test
    public void divMe() {
       assertEquals(3,m.divMe(6,2));
    }
}