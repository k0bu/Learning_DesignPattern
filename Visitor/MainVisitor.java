public class MainVisitor{
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));

            rootDir.accept(new ListVisitor());

            System.out.println("");

        } catch (FileTreatmentException e){
            e.printStackTrace();
            
        }
    }
}