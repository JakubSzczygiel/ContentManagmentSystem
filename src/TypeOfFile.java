public enum TypeOfFile {
    PDF("Pdf"),
    WORD("Word"),
    PICTURE("Picture"),
    VIDEO("Video");

    protected String typeOfFileName;

    TypeOfFile(String stringTypeOfFile) {
        this.typeOfFileName = stringTypeOfFile;
    }


}
