package oop_lab_task1;

public class FinalT6A {
     public  int temp = 4;
  private int sum;
  private int y = 1;
  public FinalT6A(int x, int p){
    temp+=1;
    System.out.println("here temp is : " + temp);
    System.out.println("here  p is : " + p);
    y = temp - p;
    sum = temp + x;
    System.out.println("here sum is : " + sum);
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodA(){    
    int x=0, y =0;
    y = y + this.y; 
    System.out.println("here y becomes: "+ y);
    System.out.println("here temp is : " + temp);
    x = this.y + 2 + temp;
    System.out.println("here x becomes: "+ x);
    sum = x + y + methodB(temp, y);
    System.out.println(x + " " + y+ " " + sum);
  }
  public int methodB(int temp, int n){
    int x = 0;
    System.out.println("here x becomes: "+ x);
    System.out.println("here temp gets incerment onece again so temp: " + (temp+1));
    y = y + (++temp);
    System.out.println("here y becomes: "+ y);
    x = x + 3 +  n;
    System.out.println(x + " " + y+ " " + sum);
    sum = sum + x + y;
    System.out.println("here sum is: " + sum);
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }

}
