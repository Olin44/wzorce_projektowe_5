package State;

public class StateMain {
    public static void main(String[] args) {
        File file = new FileImpl(FileClosed.getInstance());
        System.out.println("O1");
        file.open();
        System.out.println("O2");
        file.open();
        file.write();
        file.read();
        System.out.println("Z1");
        file.close();
        System.out.println("Z2");
        file.close();
        file.write();
        file.read();
    }

}
