import java.util.ArrayList;
import java.util.List;

public class FileStorageList {
    protected List<File> filesList = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("FILES LIST \n");
        for (File file : filesList) {
            string.append(file.toString() + "\n");
        }
        return string.toString();
    }


}
