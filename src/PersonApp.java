public class PersonApp {

    public static void main(String[] args) {

        // Setting up object from Person Class by fullfilling all the requirements.
        var person1 = new Person();
        String person1Name = person1.name = "Mustaqim";
        String person1Address = person1.address = "Karawang";
        String person1Country = person1.country;
        String person1Say = person1.sayHello("Budi");

        // Setting up object from Person Class without fullfilling all the requirements.
        var person2 = new Person();
        String person2Name = person2.name = "Budi";
        String person2Address = person2.address; // Person Address is not fullfilled which lead the variable null (//
                                                 // Default stat of String data type)
        String person2Country = person2.country;
        String person2Say = person2.sayHello("Mustaqim");

        // Print all the objects
        System.out.println(person1Name);
        System.out.println(person1Address);
        System.out.println(person1Country);
        System.out.println(person1Say);

        System.out.println(person2Name);
        System.out.println(person2Address); // Expected output Null
        System.out.println(person2Country);
        System.out.println(person2Say);
    }
}