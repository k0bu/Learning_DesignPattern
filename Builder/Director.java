public class Director{
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;

    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("First String.");
        builder.makeItems(new String[]{
            "AAAAAAAA.",
            "BBBBBBBB.",
        });

        builder.makeString("Second String.");
        builder.makeItems(new String[]{
            "CCCCCCCC.",
            "DDDDDDDD.",
        });

        builder.close();
    }
}