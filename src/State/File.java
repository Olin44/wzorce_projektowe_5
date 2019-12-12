package State;

interface File {
    void changeState(FileState fileState);
    void open();
    void close();
    void write();
    void read();
}
