public class CalcLogic {
    private int currentTotal;
    
    
    public CalcLogic() {
        currentTotal = 0;
    }
    
    public String getTotalString() {
        return "" + currentTotal;
    }
    
    public void setTotal(String n) {
        currentTotal = convertToNumber(n);
    }
    
    public void add(String n) {
        currentTotal += convertToNumber(n);
    }
    
    public void subtract(String n) {
        currentTotal -= convertToNumber(n);
    }
    
    public void multiply(String n) {
        currentTotal *= convertToNumber(n);
    }
    
    public void divide(String n) {
        currentTotal /= convertToNumber(n);
    }
    
    public void pow2 (String n)
    {
        currentTotal *= currentTotal;
    }
    
    private int convertToNumber(String n) {
        return Integer.parseInt(n);
    }
}