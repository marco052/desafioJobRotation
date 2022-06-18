package Question3;
import java.util.ArrayList;


public class Question3 {
  public static void main(String[] args) {
    DataController controller = new DataController();

    ArrayList<DataMoney> dados = controller.createArray();

    System.out.println("o maior valor eh: " + controller.biggestValue());

    System.out.println("o menor valor eh: " + controller.smallestValue());

    System.out.println("foram " + controller.daysAboveAverage() + " dias onde o faturamento foi acima da media");
  }
}