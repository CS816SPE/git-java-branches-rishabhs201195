import java.util.Scanner;

class calculator {

public static void main(String []args){

Scanner sc=new Scanner(System.in);

float a,b,res;
char choice,ch;

do{

  System.out.println("1. Add Two Numbers ");
  System.out.println("2.Multiply Two Numbers ");
  System.out.println("3. Exit \n");
  System.out.println("Enter Your Choice : ");
  choice =sc.next().charAt(0);
  switch(choice){
    
   case '1' : System.out.print("Enter Two Numbers : ");
              a=sc.nextFloat();
              b=sc.nextFloat();
              res=a+b;
              System.out.print("Result = "+res);
              break;

   case '2' : System.out.print("Enter Two Numbers : ");
              a=sc.nextFloat();
              b=sc.nextFloat();
              res=a*b;
              System.out.print("Result = "+res);
              break;
  
   case '3' :System.exit(0);
             break;

   default :System.out.print("INVALID CHOICE !! ");
            break;
}

System.out.print("\n--------------------------------------------\n");

}while(choice!=3);


}


}
