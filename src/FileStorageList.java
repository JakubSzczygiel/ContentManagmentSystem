import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class FileStorageList {
    protected List<File> filesList = new ArrayList<>();
    //  final Iterator<File> fileIterator= files.iterator();

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (File file : filesList) {
            string.append(file.toString() + "\n");
        }
        return string.toString();
    }


}
