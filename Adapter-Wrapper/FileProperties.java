import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
    public FileProperties(){
        super();
    }

    public void readFromFile(String filename) throws IOException{
        load(new FileInputStream(filename) );
    }

    public void writeToFile(String filename) throws IOException{
        store(new FileOutputStream(filename), "Written by FileProperties");
    }

    public void setValue(String key, String value){
        setProperty(key, value);
    }

    public String getValue(String key){
        return getProperty(key, "");
    }

}