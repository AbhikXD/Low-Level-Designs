 

public interface State {
    
    public void noCoinState(double amount);
    public void coinInState(int shelfId);
    public void disposalState(int shelfId) throws Exception;
}
