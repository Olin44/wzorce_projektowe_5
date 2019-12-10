package State;

public class FileClosed implements FileState {

    private static final FileClosed INSTANCE = new FileClosed();

    private FileClosed(){}

    public static FileClosed getInstance(){
        return INSTANCE;
    }

    @Override
    public void doAction() {
        System.out.println("Plik zamknięty – nie mogę czytać z/pisać do pliku");
    }

    public boolean isClosed() {
        return true;
    }
}
