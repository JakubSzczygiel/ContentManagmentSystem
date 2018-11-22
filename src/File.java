public abstract class File {
    private String author;
    private String description;
    private float fileSize;
    private String typeOfFile;
    public static final float threshold = 32000;

    public File(String typeOfFile, String author, String description, float fileSize) {
        this.typeOfFile = typeOfFile;
        this.author = author;
        this.description = description;
        this.fileSize = fileSize;
    }


}
