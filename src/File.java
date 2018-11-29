import java.util.Comparator;

import static java.util.Comparator.comparing;

public abstract class File {
    private String description;
    private float fileSize;
    private String typeOfFile;
    private User user;
    protected int hashCode;
    public static final float threshold = 32000;

    public File(String typeOfFile, User user, String description, float fileSize) {
        this.typeOfFile = typeOfFile;
        this.description = description;
        this.fileSize = fileSize;
        this.user = user;
        this.hashCode = hashCode();
    }

    // Comparator creation
    // this implementation is possible from java 8
    // public static final Comparator<File> BY_SIZE=comparing(File::getFileSize);

    //this implementation is used for earlier java versions
    public static final Comparator<File> BY_SIZE = new Comparator<File>() {
        @Override
        public int compare(File o1, File o2) {
            return Float.compare(o1.getFileSize(), o2.getFileSize());
        }
    };

    public float getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return
                typeOfFile + '|' + description + '|' +
                        ", fileSize=" + fileSize + "|" +
                        ", user=" + user + "|" +
                        ", hash=" + hashCode + "|" +
                        '}';
    }

    @Override
    public int hashCode() {
        return typeOfFile.hashCode() * 3 + description.hashCode() * 2 + (int) fileSize;
    }

}
