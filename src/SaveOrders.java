import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveOrders {
    /**
     * constructor
     * SaveOrders(String fileName -> required param, String strToSave -> optional);
     * */

    /**
     * method setStrToSave(String strToSave -> required)
     * let you change string for save or enter it, if that wasn't done previously
     * */

    /**
     * method save()
     * check strToSave for blank value and create file and directories if needed,
     * then saving string into int
     * */

    private String fileName;
    private String strToSave = "";
    private File file;
    public SaveOrders(String fileName) throws IOException {
        this.fileName = fileName;
        getFileOrCreate();
    }
    public SaveOrders(String fileName, String strToSave) throws IOException {
        this.fileName = fileName;
        this.strToSave = strToSave;
        getFileOrCreate();
    }
    private void getFileOrCreate() throws IOException {
        File f = new File(this.fileName);
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
                FileWriter myWriter = new FileWriter(fileName, true);
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
