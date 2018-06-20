package visitor;

public interface Item
{
    // accepts visitor
    public void accept(GenericOperationDoer visitor);
}
