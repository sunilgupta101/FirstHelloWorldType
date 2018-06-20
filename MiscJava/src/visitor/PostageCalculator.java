package visitor;

public class PostageCalculator implements GenericOperationDoer
{
    private double totalPostage;
    
    public void doOperation(Book book) {
        setTotalPostage(getTotalPostage() + book.getWeight() * 0.1);
    }
    
    public void doOperation(CD cd) {
        totalPostage += cd.getPrice() * 0.1;
    }

    public double getTotalPostage()
    {
        return totalPostage;
    }

    public void setTotalPostage(double totalPostage)
    {
        this.totalPostage = totalPostage;
    }
}
