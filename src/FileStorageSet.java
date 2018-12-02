import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class FileStorageSet {
    protected Collection<File> filesSet = new HashSet<>();
    protected Collection<File> filesTreeSet = new TreeSet<>(File.BY_SIZE);

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("FILES SET \n");
        for (File file : filesSet) {
            string.append(file.toString() + "\n");
        }
        string.append("FILES TreeSET \n");
        for (File file : filesTreeSet) {
            string.append(file.toString() + "\n");
        }

        return string.toString();
    }


}


