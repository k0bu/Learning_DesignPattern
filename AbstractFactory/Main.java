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

        Link sekaiju = factory.createLink("Sekaiju", "sekaiju url");
        Link etrian = factory.createLink("Etrian Odyssey", "etrian odyssey url");

        Link yahoo_us = factory.createLink("YahooUS", "https://www.yahoo.com/");
        Link yahoo_jp = factory.createLink("YahooJP", "https://www.yahoo.co.jp/");
        
        Link google = factory.createLink("Google", "https://www.google.com/");
        
        Tray trayRPG = factory.createTray("RPG games");
        trayRPG.add(sekaiju);
        trayRPG.add(etrian);

        Tray trayYahoo = factory.createLink("Yahoo");
        trayYahoo.add(yahoo_us);
        trayYahoo.add(yahoo_jp);

        Tray traySearchEngine = factory.createTray("Search Engine");
        traySearchEngine.add(trayYahoo);
        traySearchEngine.add(google);

        Page page = factory.createPage("LinkPage", "k0bu");
        page.add(trayRPG);
        page.add(traySearchEngine);
        page.output();

    }
}