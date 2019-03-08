package developer;

public class Controller {
    public static void main(String arg[])
    {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.
                setFirstName("Shubham")
                .setLastName("Bansal")
                .addFriends("Rohan")
                .addFriends("Mahesh")
                .noMoreFreindsToAdd()
                .setBestFriends("Rohan")
                .Build().sayHello();
    }
}