package visitor;

import java.util.Arrays;
import java.util.List;

public class Driver
{
    public static void main(String[] args)
    {
        // instance of visitor
        PostageCalculator postableCalc = new PostageCalculator();
        
        List<Item> items = Arrays.asList(new Book(10.0, 10.0));
        
        for (Item item : items) {
            item.accept(postableCalc);
        }

        for (Item item : items) {
//            postableCalc.doOperation(item);
            if (item instanceof Book)
            {
                postableCalc.doOperation((Book) item);
            }
            else if (item instanceof CD) {
                postableCalc.doOperation((CD) item);
            }
        }

        System.out.println(postableCalc.getTotalPostage());
    }
}
