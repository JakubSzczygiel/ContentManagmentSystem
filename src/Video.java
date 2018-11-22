public class Video extends MediaFile {
    private double duration;

    public Video(String author, String description, float fileSize, int height, int length, double duration) {
        super("Video", author, description, fileSize, height, length);
        this.duration = duration;
    }
}
