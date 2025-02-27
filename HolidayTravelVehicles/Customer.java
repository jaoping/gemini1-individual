class Customer extends Person {
    private int customerID;
    private String membershipLevel;

    public Customer(String name, String address, String phoneNumber, int customerID, String membershipLevel) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
        this.membershipLevel = membershipLevel;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public void getInvoice() {
        System.out.println("Fetching invoice for customer ID: " + customerID);
    }

    public void negotiateVehicle() {
        System.out.println("Negotiating vehicle price for customer: " + getName());
    }

    public void requestTradein() {
        System.out.println("Processing trade-in request for customer ID: " + customerID);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + getName() + '\'' +
                ", membershipLevel='" + membershipLevel + '\'' +
                '}';
    }
}
