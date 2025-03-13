import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveOrders {
    String urlToFile;
    public String strToSave = "";
    private File file;
    public SaveOrders(String urlToFile) throws IOException {
        this.urlToFile = urlToFile;
        getFileOrCreate();
    }
    public SaveOrders(String urlToFile, String strToSave) throws IOException {
        this.urlToFile = urlToFile;
        this.strToSave = strToSave;
        getFileOrCreate();
    }
    private void getFileOrCreate() throws IOException {
        File f = new File(this.urlToFile);
        if(!f.exists() || f.isDirectory()) {
            f.createNewFile();
        }
    }

    public void setStrToSave(String strToSave) {
        this.strToSave = strToSave;
    }

    public void save(){
        if (strToSave.isBlank()) {
            System.out.println("String is empty");
        } else {
            try {
                FileWriter myWriter = new FileWriter(urlToFile, true);
                myWriter.write(this.strToSave + "\n\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred while program was writing to file.");
                e.printStackTrace();
            }
        }
    }
}
