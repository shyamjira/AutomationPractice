package Com.Maven.QA.Com.Maven.QA.Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StarPatternPrograms {
	@BeforeClass
	public void ArrayProgmsStarted() {
		System.out.println("StarPatternProgmsStarted....."+"\n");
	}
	
	@AfterClass
	public void ArrayProgmsEnded() {
		System.out.println("StarPatternProgmsProgmsEnded !!!!"+"\n");
	}
	
	@BeforeMethod
	public void NewProgramStarted() {
		System.out.println("ProgramStarted....."+"\n");
	}
	
	@AfterMethod
	public void ProgramEnded() {
		System.out.println("ProgramEnded !"+"\n");
	}
	
	
	
	@Test(priority = 1)
	public void FstarPattern() {
		
		for (int i =0; i<11;i++ ) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}

	@Test(priority = 2)
	public void SecondstarPattern() {
		for (int i =0; i<11;i++ ) {
			for(int j=11;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	@Test(priority = 3)
	public void ThirdstarPattern() {
		for (int i =0; i<11;i++ ) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	@Test(priority = 4)
	public void ForthstarPattern() {
		for (int i =0; i<11;i++ ) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			} 
			
			for(int k=10;k>=i;k--) {
				System.out.print("*");
			}
			 System.out.println();
			
		} 
	}
//	@Test(priority = 5)
	public void FiFthstarPattern() {
		
		for (int i =0; i<11;i++ ) {
			for(int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=i;k>=0;k++) {
				System.out.println("*");
			}
			
		}System.out.println();
		
	}
	@Test(priority = 6)
	public void SixthstarPattern() {
		
	}

}
