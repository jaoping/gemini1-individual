import java.util.ArrayList;
import java.util.List;
class Invoice {
    private int invoiceNumber;
    private String date;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFees;
    private String customerSignature;
    private List<DealerInstalledOption> dealerInstalledOptions = new ArrayList<>();

    public Invoice(int invoiceNumber, String date, double tradeInAllowance, double taxes, double licenseFees, String customerSignature) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customerSignature = customerSignature;
    }

    public void requestDealerInstallOptions(DealerInstalledOption option) {
        dealerInstalledOptions.add(option);
    }

    public double sumFinalNegotiatedPrice() {
        double totalPrice = taxes + licenseFees;
        for (DealerInstalledOption option : dealerInstalledOptions) {
            totalPrice += option.getPrice();
        }
        return totalPrice;
    }
}
