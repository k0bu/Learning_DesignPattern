package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private Hashtable database = new Hashtable();
    private int index = 0;

    protected synchronized Product createProduct (String owner){
        return new IDCard(owner, index++);

    }

    protected void registerProduct (Product product){
        IDCard card = (IDCard) product;
        database.put(card.getOwner(), card.getIndex() );
    
    }

    public Hashtable getOwners(){
        return database;
        
    }
}