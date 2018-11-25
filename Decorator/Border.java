public abstract class Border extends Display {
    protected Display display;

    protected Border (Display display){
        //I thought super() would be called automatically
        super();
        this.display = display;

    }

}