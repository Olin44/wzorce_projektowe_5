package State;

public class FileOpened implements FileState{

    private static final FileOpened INSTANCE = new FileOpened();

    private FileOpened(){}

    public static FileOpened getInstance(){
        return INSTANCE;
    }

    @Override
    public void doAction() {
        System.out.println("Plik otwarty");
    }

    @Override
    public boolean isClosed() {
        return false;
    }
}
