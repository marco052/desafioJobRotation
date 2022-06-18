package Question4;

import java.util.ArrayList;

public class InvoiceController {
  private ArrayList<InvoicePerState> arrayData;
  private InvoicePerState data;

  public ArrayList createArray(){

    arrayData = new ArrayList<>();
    
    arrayData.add(new InvoicePerState("SP", 67836.43));
    arrayData.add(new InvoicePerState("RJ", 36678.66));
    arrayData.add(new InvoicePerState("MG", 29229.88));
    arrayData.add(new InvoicePerState("ES", 27165.48));
    arrayData.add(new InvoicePerState("Outros", 19849.53));
    return new ArrayList<>();
  }

  public ArrayList<InvoicePerState> percentual(){
    double totalTemp = 0;
    ArrayList<InvoicePerState> percentualArray = new ArrayList<>();
    for(InvoicePerState assist : arrayData){
      totalTemp += assist.getInvoice();
    }
    for(InvoicePerState assist : arrayData){
      percentualArray.add(new InvoicePerState(assist.getState(), 100 * (assist.getInvoice()/totalTemp)));
    }

    return percentualArray;
  }
}
