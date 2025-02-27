class Salesperson extends Person {
    private int salespersonID;
    private double salary;
    private String position;

    public Salesperson(String name, String address, String phoneNumber, int salespersonID, double salary, String position) {
        super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
        this.salary = salary;
        this.position = position;
    }

    public int getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(int salespersonID) {
        this.salespersonID = salespersonID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void createInvoice() {
        System.out.println("Salesperson ID: " + getSalespersonID() + " is creating an invoice.");
    }

    public void negotiateVehicle() {
        System.out.println("Salesperson ID: " + getSalespersonID() + " is negotiating with a customer.");
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "salespersonID=" + salespersonID +
                ", name='" + getName() + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
