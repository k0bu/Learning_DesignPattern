package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner;
    private int index;

    IDCard(String owner, int index){
        System.out.println("Creating (" + index + "): " + owner + "'s card...");
        this.owner = owner;
        this.index = index;
    }

    public void use(){
        System.out.println("Using (" + index + "): " + owner + "'s card...");

    }

    public int getIndex() {
        return index;
    }

    public String getOwner(){
        return owner;
    }

}