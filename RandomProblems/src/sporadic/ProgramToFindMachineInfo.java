package sporadic;

public class ProgramToFindMachineInfo {
    public static void main(String[] args) {
        String nameOS = "os.name";
        String VersionOS = "os.version";
        String architectureOS = "os.arch";
        System.out.println("Info about processor");
        System.out.println("NUMBER_OF_PROCESSORS: " + System.getenv("NUMBER_OF_PROCESSORS"));
        System.out.println("Processor MANIFACTURESR: " + System.getenv("PROCESSOR_INDENTIFIER"));
        System.out.print("Info about  OS:\t");
        System.out.print("\tname of os:" + System.getProperty(nameOS));
        System.out.print("\tversion os:" + System.getProperty(VersionOS));
        System.out.print("\tarch of OS:" + System.getProperty(architectureOS) + "\n");
        
        System.out.println("System.getProperties() are: " + System.getProperties() + "\n");
        System.out.println("System.getenv() are: " + System.getenv() + "\n");
        System.out.println("System.getSecurityManager() are: " + System.getSecurityManager() + "\n");
        
    }
}
