package interfacesFuncionais;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
           new User("Maria",21),
           new User("João", 32),
           new User("Eduardo", 36)
           );
           users.forEach(System.out::println);
          
      
    }
}
