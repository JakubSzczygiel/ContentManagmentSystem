public class RegularUser extends NotRegisteredUser {

    public RegularUser(String name, String surname, String address) {
        super(name, surname, address);
        setAccessLevel(2);
    }
}
