public class Algo2{

    public static void main(String[] args) {
        int []nums={20,2,7,-10,-158,158,89,23,70,9};
     
        int []dup={20,20};
          
        for(int i=0;i<nums.length;i++){
            if(dup[0]<nums[i]){
              dup[0]=nums[i] ;
            }if(dup[1]>nums[i]){
                 dup[1]=nums[i];
            }
           

        }
        System.out.println("max :"+dup[0]);
        System.out.println("min :"+dup[1]);
        
      


            

     }
            
        
        
}


