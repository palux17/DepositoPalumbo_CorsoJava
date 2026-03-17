public class ProvaCasting {
  public static void main(String[] args) {

    int myInt = 9;

    //Widening Casting: int to double
    double myDouble = myInt;

    //Stampa 9
    System.out.println(myInt); 

    //Stampa 9.0
    System.out.println(myDouble);     


       
    double mydouble = 9.78d;
    // casting manuale: double to int
    
    int myint = (int) mydouble;

    // Outputs 9.78
    System.out.println(mydouble);                 
    // Outputs 9
    System.out.println(myint);
    
  }
}
