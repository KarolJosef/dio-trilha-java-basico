package rh;
public record Person(String name, int age) {
    public Person{
        if(name ==null)
            System.out.println("nome não pode ser nulo");
    }
   
}
   