package rh;
public non-sealed class Salesman extends Employee {

    private double  percentPerSold;
    private double soldAmount;

    public Salesman(int age,
                    String code,
                    String name,
                    double salary,
                    double soldAmount,
                    double percentPerSold)
                     {
        super(age, code, name, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }
    @Override
    public String getCode(){        
       return "SL" + this.code; 
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
    public void setSoldAmout(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getSoldAmout() {
        return soldAmount;
    }

    @Override
    public double getfullSalary() {
        return this.salary += (salary*percentPerSold);
    }
    
    
    
}
