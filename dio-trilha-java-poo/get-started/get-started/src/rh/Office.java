package rh;

public class Office {
    public static void main(String[] args) {    
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }
    public static void printEmployee(Employee employee){       
        System.out.printf("=======%s=======\n",employee.getClass().getCanonicalName());
        if (employee instanceof  Manager manager){  
            
        }
        switch (employee){
            case Manager manager ->{
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(3000);
                manager.setLogin("joão");
                manager.setPassword("123456");
                manager.setCommission(1200.00);

                System.out.println(manager.getSalary());
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
           case Salesman salesman ->{
            salesman.setCode("123");
            salesman.setName("João");
            salesman.setSalary(5000);
            salesman.setPercentPerSold(10);
            salesman.setSoldAmout(1000);
          

            System.out.println(salesman.getSalary());
            System.out.println(salesman.getCode());
            System.out.println(salesman.getName());
            System.out.println(salesman.getPercentPerSold());           
           }
        }
       System.out.println("full salary extra"); 
       System.out.println("Full Salary " + employee.getfullSalary());
       System.out.println("================");
    }
}
