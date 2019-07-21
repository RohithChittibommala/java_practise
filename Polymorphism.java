class A{
  void show(){
    System.out.println("in A");
  }
}

class B extends A{
  void show(){
    System.out.println("in B");
  }
}

class C extends A{
  void show(){
    System.out.println("in C");
  }
}




public class Polymorphism{
  public static void main(String[] args) {
    A obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }
}
