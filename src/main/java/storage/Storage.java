package storage;

public interface Storage {

    public void save(String dataToFile, String pathFile);
    public String read(String pathFile);
}
