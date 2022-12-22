package Com.Maven.QA.Com.Maven.QA.Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ArraysPrograms {
	
	@BeforeClass
	public void ArrayProgmsStarted() {
		System.out.println("ArrayProgmsStarted....."+"\n");
	}
	
	@AfterClass
	public void ArrayProgmsEnded() {
		System.out.println("ArrayProgmsEnded !!!!"+"\n");
	}
	
	@BeforeMethod
	public void NewProgramStarted() {
		System.out.println("ProgramStarted....."+"\n");
	}
	
	@AfterMethod
	public void ProgramEnded() {
		System.out.println("ProgramStarted !"+"\n");
	}
	
	
	public void MaxNumberOfArray() {
		
		int [] ar = {22,46,43,78,65,89,77,69,88,79,9,28,69,34,56,78,65,80};
		int max = 0;
		
		for(int i= 0; i <ar.length;i++) {
			
			if(max<ar[i]) {
				max =ar[i];
			}
		}  
		System.out.println("the maximun number of given an array is: "+max);
	}
	
	
	
	public void MinNunberOfArray() {
		
		int arr [] = {22,33,32,43,56,55,98,34,32,12,34,51,63,18};
		int min =100;
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
	}
	public void MissingNumberOfArray() {
		
		int [] ar1= {11,12,13,14,15,16,17,19,20};
		int sum = 0;
		int sum1=0;
		for(int i =10; i<=20;i++) {
			sum = sum+i;
		}
		for(int j =0; j<=ar1.length ;j++) {
			sum1=sum1+ar1[j];
		}
		
		int MN = sum1-sum;
		
		System.out.println("The missing number of an array is: "+MN);
	}
}
