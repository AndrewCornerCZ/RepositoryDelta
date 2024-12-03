package storage;

import java.io.IOException;

public class FileSystemStorage implements Storage {
    @Override
    public void save(String dataToFile, String pathFile) {
        try{
            IO.writeFile(pathFile, dataToFile);
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String read(String pathFile) {
        try{
            return IO.readFile(pathFile);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
