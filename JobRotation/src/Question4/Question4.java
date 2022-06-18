package Question4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Question4 {
  public static void main(String[] args) {
    InvoiceController controller = new InvoiceController();
    ArrayList<InvoicePerState> array = controller.createArray();
    System.out.println(controller.percentual());
  }
}
