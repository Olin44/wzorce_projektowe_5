package State;

public class FileImpl implements File{
    FileState fileState;

    public void setFileState(FileState fileState) {
        this.fileState = fileState;
    }

    public FileImpl(FileState fileState) {
        this.fileState = fileState;
    }

    @Override
    public void open() {
        if(fileState.isClosed()){
            fileState.doAction();
            setFileState(FileOpened.getInstance());
            fileState.doAction();
        }
        else{
            System.out.println("Plik jest już otwarty");
        }
    }

    @Override
    public void close() {
        if(fileState.isClosed()){
            fileState.doAction();
        }
        else{
            fileState.doAction();
            setFileState(FileClosed.getInstance());
            System.out.println("Zamykam plik");
        }
    }


    @Override
    public void read() {
        if(fileState.isClosed()){
            fileState.doAction();
        }
        else {
            System.out.println("Czytam z pliku");
        }
    }

    @Override
    public void write() {
        if(fileState.isClosed()){
            fileState.doAction();
        }
        else {
            System.out.println("Zapisuję do pliku");
        }
    }
}
