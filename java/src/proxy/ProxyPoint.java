package proxy;

public class ProxyPoint implements SellTickets{

    private Trainstation trainstation=new Trainstation();

    @Override
    public void sell() {
        System.out.println("proxypoint receive service fee");
    }
}
