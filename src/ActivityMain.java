import java.util.Scanner;

public class ActivityMain
{
	linkedListADT list = new linkedListADT();
	static ActivityFunc gameFunc = new ActivityFunc();
	
	public static void main(String[] args)
	{        
		char[] mainCharArr = new char[10];
    	char mArrow;

        System.out.println("Activity Main Started");
    	
    	
		for(int re = 0; re < mainCharArr.length; re++)
		{
			System.out.println("CharArr");
			mainCharArr[re] = gameFunc.InitArr();
			System.out.println("CharArr" + mainCharArr[re]);
		}
		

        System.out.println("FIN Init Func");
		
    	gameFunc.DebugArr(mainCharArr);
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("PressArrows");

        mArrow = scanner.next().charAt(0);
        
        
        while(mArrow != 'y')
        {
        	gameFunc.KeyInput(mArrow);
        	mArrow = scanner.next().charAt(0);
        }
    	gameFunc.clearConcole(10);
    	System.out.println("Thank you");

        
        scanner.close();    
    }
	
	

}