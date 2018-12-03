public class Video extends MediaFile {
    private double duration;

    public Video(User user, String description, float fileSize, int height, int length, double duration) {
        super(TypeOfFile.VIDEO, user, description, fileSize, height, length);
        this.duration = duration;
    }
}
