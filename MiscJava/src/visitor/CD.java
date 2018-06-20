package visitor;

public class CD implements Item
{
    private double price;
    
    public void accept(GenericOperationDoer visitor)
    {
        visitor.doOperation(this);
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
