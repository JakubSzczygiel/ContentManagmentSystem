import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FileStorageSet {
    protected Collection<File> filesSet = new HashSet<>();

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (File file : filesSet) {
            string.append(file.toString() + "\n");
        }
        return string.toString();
    }


}


