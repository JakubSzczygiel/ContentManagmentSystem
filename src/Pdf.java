public class Pdf extends TextDocument {
    public Pdf(User user, String description, float fileSize) {
        super(TypeOfFile.PDF, user, description, fileSize);
    }
}
