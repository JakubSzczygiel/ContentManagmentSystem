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
        File word = Kuba.createWord("WordTitle", 31);
        File pdf = Kuba.createPdf("PdfTitle", 32);
        File picture = Kuba.createPicture("PictureTitle", 33, 1080, 1920);
        File video = Kuba.createVideo("VideoTitle", 34, 1080, 1920, 280);

        //documents added to list
        fileStorageList.filesList.add(picture);
        fileStorageList.filesList.add(video);
        fileStorageList.filesList.add(video);
        fileStorageList.filesList.add(word);
        fileStorageList.filesList.add(pdf);

        //Sorting ArrayList by file Size - comparator created in File class
        fileStorageList.filesList.sort(File.BY_SIZE);

        System.out.println(fileStorageList);



        /*if (word != null)
            word.EditFile();*/
        //documents added to TreeSet
        fileStorageSet.filesSet.add(word);
        fileStorageSet.filesSet.add(pdf);
        fileStorageSet.filesSet.add(picture);
        fileStorageSet.filesSet.add(word);
        fileStorageSet.filesSet.add(word);


        System.out.println(fileStorageSet);
    }
}
