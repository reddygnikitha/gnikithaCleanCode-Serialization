package CleanCode;

import java.util.*;
public class calculateCompound implements simpleCompound{
	Scanner scanner;
	int principle;
	int interestRate;
	int termOfLoan;

	    calculateCompound()
	    {
	        scanner = null;
	        principle = 0;
	        interestRate = 0;
	        termOfLoan = 0;
	    }

	    public float calculateSimpleInterest() {
	         float simpleInterest = (principle*((float)interestRate/100)*termOfLoan)/100;
	         return simpleInterest;
	        }

	    
	    public double calculateCompoundInterest()
	    {
	        double compoundInterest = (double)(principle * (Math.pow((1+(double)interestRate/100),termOfLoan)))-principle;
	        return compoundInterest;        
	    }
	    
	   
	    public void readInput()
	    {
	        scanner = new Scanner(System.in);
	        System.out.println("Enter the Principle Amount ");
	        principle = scanner.nextInt();
	        System.out.println("Enter the Interest Rate ");
	        interestRate = scanner.nextInt();
	        System.out.println("Enter the Term of Loan");
	        termOfLoan = scanner.nextInt();
	    }
}