public class Patient {
    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // finalize() (rarely used; discouraged)
    @Override
    protected void finalize() {
        System.out.println("Object is being garbage collected");
    }
}

