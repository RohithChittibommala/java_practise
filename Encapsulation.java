class Student  {
  private int rollNo;
  private int name;

  public int getrollNo(){
    System.out.println("Harish Roll no was viewed");
    return this.rollNo;
  }
  public void setrollNo(int num){
    this.rollNo = num;
  }
}
public class Encapsulation{
  public static void main(String[] args) {
    Student obj1  = new Student();
    obj1.setrollNo(20);
    obj1.getrollNo();
  }
}
