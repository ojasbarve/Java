class CPU {

    private String processor = "Intel i7";

    class ProcessorModule {
        void display() {
            System.out.println("Processor used: " + processor);
        }
    }

    void createModule() {
        ProcessorModule pm = new ProcessorModule();
        pm.display();
    }
}

public class MainCPU {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.createModule();
    }
}