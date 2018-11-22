public class Program {
    public static void main(String[] args) {
        AdminUser Kuba = new AdminUser("Kuba", "Szczygiel", "Maslicka 177f/5, 54-104 Wroclaw");
        Kuba.createPdf("Jonosfera", 32030);

        NotRegisteredUser Mateusz = new NotRegisteredUser("Mateusz", "Szczygiel", "Maslicka 177f/9, 54-104 Wroclaw");
        Mateusz.createVideo("Mateusz", "Szczygiel", 53534343, 1080, 1920, 280);


    }
}
