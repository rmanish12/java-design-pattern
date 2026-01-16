package factory;

// Factory pattern is used when we have a super class
// with multiple sub-classes and based on the input, we have to return
// one of the sub class
public class FactoryPattern {
    public static void main(String[] args) {
        Computer computer1 = ComputerFactory.getComputer("PC", "12 GB", "500 GB", "Intel");
        Computer computer2 = ComputerFactory.getComputer("Server", "24 GB", "1 TB", "Intel");
        Computer computer3 = ComputerFactory.getComputer("Mobile", "2GB", "12 GB", "Snapdragon");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
