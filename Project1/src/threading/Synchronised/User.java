package threading.Synchronised;

public class User implements Runnable {



    printer Printer;
    String document;
    public User(printer printer, String document) {
        Printer = printer;
        this.document = document;
    }
    @Override
    public void run() {
      Printer.printDocument(document);
    }
}
