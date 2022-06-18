package Question3;
public class DataMoney implements Comparable<DataMoney>{
  private int day;
  private float value;

  public DataMoney(int dayParameter, float valueParameter){
    this.day = dayParameter;
    this.value = valueParameter;
  }

  public int getDay() {
    return this.day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public float getValue() {
    return this.value;
  }

  public void setValue(float value) {
    this.value = value;
  }

  public String toString(){
    return "{dia: " + day + " - valor: " + value + "}";  
  }

  @Override 
  public int compareTo(DataMoney otherData){
    if(this.value > otherData.value){
      return 1;
    }
    else if(this.value < otherData.value){
      return -1;
    }
    return 0;
  }
}

