class A{
  int i;
  void show(){
    System.out.println(i);
  }
}

class B extends A{
  @Override

  void show(){
    super.i = 8;
    super.show();
    System.out.println("In B");
  }
}


public class Multipleinheritance{
  public static void main(String[] args) {
    B obj = new B();
    obj.show();
  }
}
