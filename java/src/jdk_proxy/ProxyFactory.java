package jdk_proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        SellTickets proxy = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Object obj = method.invoke(station,args);

                        return obj;
                    }
        });
        return proxy;
    }
}
