package rh;
public  non-sealed  class Manager extends Employee {

    private String login;
    private String password;
    private double commission;

    public Manager(int age,
                    String code,
                    String name,
                    double salary,
                    String login,
                    String password,
                    double commission) {
        super(age, code, name, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }
    public Manager(){

    }
    //Sobre escrita é quando chamamos um metodo da classe pai e mudamossua ogica 
    @Override
    public String getCode(){
        return "MN"+this.code;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    @Override
    public double getfullSalary() {
        return this.salary + this.commission;
    }
    // Sobre Carga de metodo é quando usamos o mesmo metodo com diferentes parametros
    public double getfullSalary(double extra){
        return this.getfullSalary() + extra;
    }
    

}
