package framework;
import java.util.Hashtable;

import framework.Product;

public class Manager{
    private Hashtable showcase = new Hashtable<>();
    public void register (String name, Product instance){
        showcase.put(name, instance);

    }

    public Product create(String instanceName){
        Product p = (Product) showcase.get(instanceName);
        return p.createClone();

    }
}