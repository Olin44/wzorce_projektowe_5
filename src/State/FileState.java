package State;

abstract class FileState {
    File file;
    FileState(File file){
        this.file = file;
    }
    abstract void open();
    abstract void close();
    abstract void write();
    abstract void read();
}
