import java.util.Random;

public abstract class File {
    private String author;
    private String description;
    private float fileSize;
    private String typeOfFile;
    private User user;
    protected int hashCode;
    public static final float threshold = 32000;

    public File(String typeOfFile, User user, String description, float fileSize) {
        this.typeOfFile = typeOfFile;
        this.author = author;
        this.description = description;
        this.fileSize = fileSize;
        this.user = user;
        this.hashCode = hashCode();
    }

    @Override
    public int hashCode() {
        return author.hashCode() * 3 + description.hashCode() * 2 + (int) fileSize;
    }
}
