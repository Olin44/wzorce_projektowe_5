package State;

public class FileImpl implements File {
    private FileState fileState;

    FileImpl() {
        this.fileState = new FileClose(this);
    }

    @Override
    public void changeState(FileState fileState) {
        this.fileState = fileState;
    }

    @Override
    public void open() {
        fileState.open();
    }

    @Override
    public void close() {
        fileState.close();
    }

    @Override
    public void write() {
        fileState.write();
    }

    @Override
    public void read() {
        fileState.read();
    }
}
