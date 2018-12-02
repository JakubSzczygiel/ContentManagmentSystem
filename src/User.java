public abstract class User {
    private static int counter;
    private String name;
    private String surname;
    private String address;
    private int id;
    private int accessLevel;

    protected int hashCode;
    private Validator validator = new Validator();

    {
        id = ++counter;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }


    public String getName() {
        return name;
    }

    public User(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.hashCode = hashCode();
    }

    public Pdf createPdf(String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
           return new Pdf(this, description, fileSize);
        }
        return null;
    }

    public Word createWord(String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
            return new Word(this, description, fileSize);
        }
        return null;
    }


    public Video createVideo(String description, float fileSize, int height, int length, double duration) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            return new Video(this, description, fileSize, height, length, duration);
        }
        return null;
    }

    public Picture createPicture(String description, float fileSize, int height, int length) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            return new Picture(this, description, fileSize, height, length);
        }
        return null;
    }

    @Override
    public String toString() {
        return ", id=" + id + "|" +
                name + '|' +
                surname + '|' +
                address + '|' +
                "accessLevel=" + accessLevel;
    }

    @Override
    public int hashCode() {
        return id * 5 + accessLevel * 4 + name.hashCode() * 3 + surname.hashCode() * 2 + address.hashCode();
    }
}
