import factory.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);

        }

        Factory factory = Factory.getFactory(args[0]);

        Link google = factory.createLink("Google", "https://www.google.com/");
        Link yahoo = factory.createLink("Yahoo", "https://www.yahoo.co.jp/");

        Tray traySearchEngine = factory.createTray("Search Engine");
        traynews.add(google);
        traynews.add(yahoo);

        Page page = factory.createPage("LinkPage", "k0bu");
        page.add(traySearchEngine);
        page.output();

    }
}