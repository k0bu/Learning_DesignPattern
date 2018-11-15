import java.io.*;

public class Main{
    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try{
            f.readFromFile("file.txt");
            f.setValue("year", "2018");
            f.setValue("month", "12");
            f.setValue("day", "11");
            f.writeToFile("newfile.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}