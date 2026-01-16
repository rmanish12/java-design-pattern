package abstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "Intel"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("5GB", "1TB", "Intel"));

        System.out.println(pc);
        System.out.println(server);
    }
}
