package test.com.enumInterface;

public enum BasicOperation implements Operation {
    PLUS("+"){
        public double apply(double x, double y){
            return x + y;
        }
    },TIMES("*"){
        public double apply(double x, double y){
            return x * y;
        }
    };
    
    private final String symbol;
    
    private BasicOperation(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public String toString(){
        return symbol;
    }
}
