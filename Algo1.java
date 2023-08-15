import java.util.Scanner;

public class Algo1{

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                
        int c=0;
        loop:
        do{
            System.out.print("Enter a positive Number :");
            int nums=scanner.nextInt();
            scanner.nextLine();
            int []dup= new int[3];
            dup[1]=1;
            dup[0]=0;
           

            if(nums<0){
                System.out.println("Enter correct number :");
                continue loop;
            }else if(nums==0||nums==1){
                System.out.println("Fiboniso Number is "+dup[1]);
                continue loop;
            }
            else {
                for(int i=0;i<nums-1;i++){
                    c=dup[1]+dup[0];
                    dup[0]=dup[1];
                    dup[1]=c;

                }
                System.out.println(" Fibonacu is  "+c);

                 }
         

            

        }while(true);
       
    }
}
        
        
        

       
           

        
        
    

