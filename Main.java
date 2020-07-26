package CleanCode;
import java.util.*;
class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1: Calculate Compound and Simple Interest");
            System.out.println("2: Estimate Cost for Construction of House");
            System.out.println("3: Exit");
                   
            switch(sc.nextInt())
            {
                case 1 :
                calculateCompound calculateSimpleCompound = new calculateCompound();
       
                calculateSimpleCompound.readInput();
                
               float simpleInterest= calculateSimpleCompound.calculateSimpleInterest();
               
                double compoundInterest=calculateSimpleCompound.calculateCompoundInterest();
                 break;
                 case 2:
                 
                 input in = new input();
                 
                 in.readInput();
                 
                 String standard=in.getStandard();
                 int totaArea=in.getTotalArea();
                 
                 findHouseCost findhouseCost = new findHouseCost(standard, totaArea);
                int estimatedCost= findhouseCost.find();
                break;
                case 3:
                System.exit(0);
                default:
                break;        

            }
        }

       
        


    }
}
