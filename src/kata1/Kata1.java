package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        
        Person person = new Person("Michael", new Date(96,04,25));
        System.out.println(person.getName() + " tiene " + 
                            person.getAge() + " años");
    }
    
}
