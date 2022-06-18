package Question3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataController {
  private ArrayList<DataMoney> arrayData;
  private DataMoney data;

  public ArrayList createArray(){
    arrayData = new ArrayList<>();
    JSONArray jSONArray;
    JSONParser parser = new JSONParser();

    try{
      jSONArray = (JSONArray) parser.parse(new FileReader("dados.json"));
      for(Object o : jSONArray){
        JSONObject tempObject = (JSONObject) o;
        int day = Integer.parseInt(tempObject.get("dia").toString());
        float value = (float) Double.parseDouble(tempObject.get("valor").toString());   
        
        data = new DataMoney(day, value);
        arrayData.add(data);
      }
      System.out.println(data + "\n");


    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    } catch (org.json.simple.parser.ParseException e) {
      e.printStackTrace();
    }

    return arrayData;
  }

  public void sortByValue(ArrayList<DataMoney> list){
    Collections.sort(list);
  }


  public float biggestValue(){
    ArrayList<DataMoney> temp = new ArrayList<>(arrayData);
    sortByValue(temp);
    return temp.get(temp.size()-1).getValue();
  }

  public float smallestValue(){ //ESSA FUNÇÃO NAO CONSIDERA OS VALORES DE DIAS QUE NÃO TEVE FATURAMENTO
    ArrayList<DataMoney> temp = new ArrayList<>(arrayData);
    sortByValue(temp);
    for(DataMoney data : temp){
      if (data.getValue() > 0){
        return data.getValue();
      }
    }
    return temp.get(0).getValue();
  }

  public float averageValue(){
    float average = 0;
    int daysWithoutInvoice = 0;
    for(DataMoney data : arrayData){
      if (data.getValue() > 0){
        average += data.getValue();
      }
      else{
        daysWithoutInvoice ++;
      }
    }

    float secondValue = arrayData.size() - daysWithoutInvoice;
    
    average = average/secondValue;
    return average;
  }

  public int daysAboveAverage(){
    int totalDaysAboveAverage = 0;
    for(DataMoney data : arrayData){
      if (data.getValue() > averageValue()){
        totalDaysAboveAverage++;
      }
    }
    System.out.println(averageValue());
    return totalDaysAboveAverage;
  }

}
