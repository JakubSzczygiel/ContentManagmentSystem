public class AdminUser extends RegularUser {

    public AdminUser(String name, String surname, String address) {
        super(name, surname, address);
        setAccessLevel(1);
    }
}
