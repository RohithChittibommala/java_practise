class Add{
  int a,b;
  Add(int a, int b){
    this.a = a;
    this.b = b;
  }
   int add(){
    int c = a + b;
    return c;
  }
}

class Sub extends Add{
    int a,b;
  Sub(int a, int b){
    super(a,b);
    this.a = a;
    this.b = b;
  }
int sub(){
    int c = a - b;
    return c;
  }
}

class Mul extends Sub{
    int a,b;
  Mul(int a,int b){
    super(a,b);
    this.a = a;
    this.b = b;
  }
  public int mul(){
    int c = a * b;
    return c;
  }
}

public class Inheritance{
  public static void main(String[] args) {
    Mul calc = new Mul(1,2);
    int d = calc.add();
    int e = calc.sub();
    int f = calc.mul();
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
  }
}
