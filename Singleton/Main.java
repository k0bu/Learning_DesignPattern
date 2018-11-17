public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same instance.");
        } else {
            System.out.println("obj1 and obj2 is not same instance.");
        }

        for(int i = 0; i < 10 ; i++){
            System.out.println(i + ": " + Triple.getInstance(i%3) );
            System.out.println(i + ": " + TicketMaker.getInstance().getNextTicketNumber() );
        }

        
        

        System.out.println("End.");

    }

}