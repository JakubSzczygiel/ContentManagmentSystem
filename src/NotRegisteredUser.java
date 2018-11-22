public class NotRegisteredUser extends User {

    public NotRegisteredUser(String name, String surname, String address) {
        super(name, surname, address);
        setAccessLevel(3);
    }
}
