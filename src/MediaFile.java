public class MediaFile extends File {
    private int height;
    private int length;
    public static final int heightThreshold = 1080;
    public static final int lengthThreshold = 1920;


    public MediaFile(String typeOfFile, User user, String description, float fileSize, int height, int length) {
        super(typeOfFile, user, description, fileSize);
        this.height = height;
        this.length = length;
    }
}
