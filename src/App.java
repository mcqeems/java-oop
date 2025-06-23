public class App {

    public static void main(String[] args) {
        var person1 = new Person();
        String person1Name = person1.name = "Mustaqim";
        String person1Address = person1.address = "Karawang";
        String person1Country = person1.country;
        String person1Say = person1.sayHello("Budi");

        System.out.println(person1Name);
        System.out.println(person1Address);
        System.out.println(person1Country);
        System.out.println(person1Say);
        System.out.println(person1Say);

    }
}