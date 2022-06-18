package Question4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InvoicePerState {
  String state;
  double invoice;

  public InvoicePerState(String stateParameter, double invoiceParameter){
    this.state = stateParameter;
    this.invoice = invoiceParameter;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public double getInvoice() {
    return this.invoice;
  }

  public void setInvoice(double invoice) {
    this.invoice = invoice;
  }

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("#.##");
    //df.setRoundingMode(RoundingMode.CEILING);
    return "Estado: " + state + " - Faturamento: " + df.format(invoice); 
  }

}
