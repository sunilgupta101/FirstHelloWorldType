import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Try
{
    private int val = 1;
    
    public Try()
    {
        System.out.println("Constructor called");
    }

    @Test
    public void test()
    {
        System.out.println("test: " + val++);
        System.out.println("Not yet implemented");
    }

    @Test
    public void test1()
    {
        System.out.println("test1: " + val++);
        System.out.println("Not yet implemented");
    }

    @Test
    public void test2()
    {
        System.out.println("test: " + val++);
        System.out.println("Not yet implemented");
    }

    @Test
    public void test3()
    {
        System.out.println("test: " + val++);
        System.out.println("Not yet implemented");
    }

    @Test
    public void test4()
    {
        System.out.println("test: " + val++);
        System.out.println("Not yet implemented");
    }

    public void testAnother() {
        System.out.println("another");
    }

}
