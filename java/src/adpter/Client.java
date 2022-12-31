package adpter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg=computer.readSD(new SDCardImpl());

        System.out.println(msg);

        System.out.println("===================");

        String msg2=computer.readSD(new SDAdapterTF());
        System.out.println(msg2);


    }
}
