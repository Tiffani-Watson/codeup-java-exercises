public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + "!");
    }

    public static void main(String[] args) {
        // Create a new Person object
//        Person person = new Person("John Doe");

        // Test the methods
//        System.out.println("Initial name: " + person.getName());

//        person.setName("Jane Smith");
//        System.out.println("New name: " + person.getName());
//
//        person.sayHello();
//
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
