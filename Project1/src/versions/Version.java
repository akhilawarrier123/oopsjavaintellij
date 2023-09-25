package versions;

public class Version {
    public static void main(String[] args) {
        Runtime.Version version=Runtime.version();
        System.out.println("Java version :  "+version);
    }
}
