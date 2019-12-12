package State;

public class FileOpen extends FileState {

    FileOpen(File file) {
        super(file);
    }

    @Override
    public void open() {
        System.out.println("Plik został już otwarty");
    }

    @Override
    public void close() {
        System.out.println("Zamykam plik");
        this.file.changeState(new FileClose(this.file));
    }

    @Override
    public void write() {
        System.out.println("Piszę do pliku");
    }

    @Override
    public void read() {
        System.out.println("Czytam z pliku");
    }
}
