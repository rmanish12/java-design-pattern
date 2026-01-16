package abstractFactory;

public class ServerFactory implements ComputerAbstractFactory {
    private String RAM;
    private String HDD;
    private String CPU;

    public ServerFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new Server(RAM, HDD, CPU);
    }
}
