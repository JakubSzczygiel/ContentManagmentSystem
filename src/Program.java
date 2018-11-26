public class Program {
    public static void main(String[] args) {
        Word word;
        AdminUser Kuba = new AdminUser("Kuba", "Szczygiel", "Maslicka 177f/5, 54-104 Wroclaw");
        word=Kuba.createWord("Jonosfera", 320);

        RegularUser Mateusz = new RegularUser("Mateusz", "Szczygiel", "Maslicka 177f/9, 54-104 Wroclaw");
        Mateusz.createVideo("Mateusz", 53534343, 1080, 1920, 280);

        word.EditFile(word);

    }
}
