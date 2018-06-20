package visitor;

public class Book implements Item
{
    private double price;
    private double weight;
    
    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    
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

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

}
