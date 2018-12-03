public class Word extends TextDocument implements Editable {
    public Word(User user, String description, float fileSize) {
        super(TypeOfFile.WORD, user, description, fileSize);
    }

    @Override
    public void EditFile() {
        System.out.println("Your Word document can be edited");
    }
}
