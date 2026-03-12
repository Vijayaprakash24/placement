// class A {
//   protected int a;
//   A(int a){
//     this.a = a;
//   }
// }

// class B extends A {
//   int b;
//   B(int b, int a){
//     super(a);   
//     this.b = b;
//   }
// }

// public class Day12_1 {
//   int c;

//   public void sum(B obj){
//     c = obj.a + obj.b;
//     System.out.println(c);
//   }

//   public static void main(String[] args) {
//     B obj = new B(5, 11);  
//     Day12_1 obj1 = new Day12_1();
//     obj1.sum(obj);         
//   }
// }
