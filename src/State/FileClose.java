package State;

public class FileClose extends FileState{
    FileClose(File file) {
        super(file);
    }

    @Override
    public void open() {
        System.out.println("Otwieram plik");
        this.file.changeState(new FileOpen(this.file));
    }

    @Override
    public void close() {
        System.out.println("Plik został już zamknięty");
    }

    @Override
    public void write() {
        System.out.println("Nie mogę zapisać do pliku, plik zamknięty.");
    }

    @Override
    public void read() {
        System.out.println("Nie mogę przezytać pliku, plik zamknięty");
    }
}
