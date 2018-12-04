public class MainTemplateMethod{
    public static void main(String[] args) {
        AbstractDisplay charDsp = new CharDisplay('H');
        AbstractDisplay strDsp = new StringDisplay("Hello World!");
        AbstractDisplay strDsp2 = new StringDisplay("こんにちは");

        charDsp.display();
        System.out.println("");
        strDsp.display();
        System.out.println("");
        strDsp2.display();

    } 
}