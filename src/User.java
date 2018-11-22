public abstract class User {
    private static int counter;
    private String name;
    private String surname;
    private String address;
    private String author;
    private int id;
    private int accessLevel;
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
    }

    public void createPdf(String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
            new Pdf(this, description, fileSize);
        }
    }

    public void createWord(String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
            new Word(this, description, fileSize);
        }
    }


    public void createVideo(String description, float fileSize, int height, int length, double duration) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            new Video(this, description, fileSize, height, length, duration);
        }

    }

    public void createPicture(String description, float fileSize, int height, int length) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            new Picture(this, description, fileSize, height, length);
        }
    }

}
