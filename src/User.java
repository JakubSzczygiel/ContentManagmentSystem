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

    public String getName() {
        return name;
    }

    public User(String name, String surname, String address, int accessLevel) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.accessLevel = accessLevel;
        this.author = name + " " + surname;
    }

    public void createPdf(String author, String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
            new Pdf(author, description, fileSize);
        }
    }

    public void createPdf(String description, float fileSize) {
        createPdf(this.author, description, fileSize);
    }


    public void createWord(String author, String description, float fileSize) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize)) {
            new Word(author, description, fileSize);
        }
    }

    public void createWord(String description, float fileSize) {
        createWord(this.author, description, fileSize);
    }

    public void createVideo(String author, String description, float fileSize, int height, int length, double duration) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            new Video(author, description, fileSize, height, length, duration);
        }

    }

    public void createVideo(String description, float fileSize, int height, int length, double duration) {
        createVideo(this.author, description, fileSize, height, length, duration);

    }

    public void createPicture(String author, String description, float fileSize, int height, int length) {
        if (validator.isAccessLevelFine(this, 1) && validator.isSizeIsFine(fileSize) && validator.isResolutionFine(height, length)) {
            new Picture(author, description, fileSize, height, length);
        }
    }

    public void createPicture(String description, float fileSize, int height, int length) {
        createPicture(this.author, description, fileSize, height, length);
    }


}
