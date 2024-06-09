package oop_lab_task1;

public class T6ATester
{
  public static void main(String[] args)
  {
    FinalT6A q1 = new FinalT6A(2,1);
    q1.methodA();
    FinalT6A q2 = new FinalT6A(3,5);
    q2.methodA();  
    q1 = new FinalT6A(5,7);
    q1.methodA();
    q2.methodA();
  }
}
