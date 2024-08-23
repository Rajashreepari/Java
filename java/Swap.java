class Swap{
  public static void main(String[] args){
  int a1=10;
  int b1=20;
  System.out.println("before" +a1 + b1);
  a1=b1;
  int a2=10;
  int b2=20;
  b2=a2;
  System.out.println("after" +a1 + b2);
  }
}