package jdk_proxy;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("TrainStation sell tickets");
    }
}
