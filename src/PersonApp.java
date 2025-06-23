public class PersonApp {

    public static void main(String[] args) {

        var person1 = new Person("Mustaqim", "Karawang");
        var person1Say = person1.sayHello("Eko");

        var person2 = new Person("Eko", "Jakarta");
        var person2Say = person2.sayHello("Mustaqim");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println(person1Say);

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        System.out.println(person2Say);
    }
}