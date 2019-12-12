package State;

public class StateMain {
    public static void main(String[] args) {
        File file = new FileImpl();
        file.read();
        file.write();
        file.close();
        file.open();
        file.open();
        file.read();
        file.write();
        file.close();
    }
}
