package class21;

public class FileTester {
    public static void main(String[] args) {

        File[] arr = {new JavaFile("JavaFile.java", 5000), new WordFile("Word.com", 500), new PDFFile("New.Pdf", 1000)};

        for (File v : arr) {
            v.open();
            v.edit();
            v.close();
        }

    }
}