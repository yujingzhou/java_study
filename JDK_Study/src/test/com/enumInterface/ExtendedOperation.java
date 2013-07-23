package test.com.enumInterface;

public enum ExtendedOperation implements Operation {
    MINUS("-"){
        public double apply(double x, double y) {
            return x - y;
        }
        
    };
    

    private final String symbol;
    
    private ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public String toString(){
        return symbol;
    }
}
