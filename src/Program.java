import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {

        //place to store a list of files - documents might be duplicated
        FileStorageList fileStorageList = new FileStorageList();

        //place to store a set of files - documents can't duplicated
        FileStorageSet fileStorageSet = new FileStorageSet();

        //bunch of users
        AdminUser Kuba = new AdminUser("Kuba", "Szczygiel", "Maslicka 177f/5, 54-104 Wroclaw");
        RegularUser Mateusz = new RegularUser("Mateusz", "Szczygiel", "Maslicka 177f/9, 54-104 Wroclaw");

        //document creation
        File word = Kuba.createWord("WordTitle", 33);
        File word2 = word;
        File word3 = Kuba.createWord("WordTitle", 33);
        File pdf = Kuba.createPdf("PdfTitle", 34);
        File picture = Kuba.createPicture("PictureTitle", 32, 1080, 1920);
        File video = Kuba.createVideo("VideoTitle", 31, 1080, 1920, 280);

        //documents added to list
        Collections.addAll(fileStorageList.filesList, picture, video, video, word, pdf);
        //Sorting ArrayList by file size - comparator created in File class
        fileStorageList.filesList.sort(File.BY_SIZE);
        //List printing
        System.out.println(fileStorageList);

        //Sorting ArrayList by Enum
        fileStorageList.filesList.sort(File.BY_TYPE_OF_FILE);
        System.out.println(fileStorageList);
        //

        //documents added to HashSet
        Collections.addAll(fileStorageSet.filesSet, word, pdf, picture, word, word2, word3);
        fileStorageSet.filesTreeSet.addAll(fileStorageSet.filesSet);

        //hashset and treeSet(treeSet sorted over file_size) printing
        System.out.println(fileStorageSet);

        float zmienna = 3.14F;
        System.out.println(zmienna);



         /*if (word != null)
            word.EditFile();*/
    }
}
