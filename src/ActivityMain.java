import java.util.Scanner;

public class ActivityMain
{
	linkedListADT list = new linkedListADT();
	static ActivityFunc gameFunc = new ActivityFunc();
	
	public static void main(String[] args)
	{
		int maxArray = 10;
		char[] mainCharArr = new char[10];
    	char mArrow;

        System.out.println("Activity Main Started");
    	
        //First Init
		for(int re = 0; re < maxArray; re++)
		{
			mainCharArr[re] = gameFunc.InitArr();
		}

    	gameFunc.DebugArr(mainCharArr);
        System.out.println("- FIN Init Func");

    	gameFunc.clearConcole(20);
        Scanner scanner = new Scanner(System.in);        
        System.out.println("PressArrows");
    	gameFunc.clearConcole(10);

        
        mArrow = scanner.next().charAt(0);
        
        
        while(mArrow != '.')
        {
        	gameFunc.KeyInput(mArrow);
           	gameFunc.clearConcole(10);

        	mArrow = scanner.next().charAt(0);
           	gameFunc.clearConcole(10);
        }
    	gameFunc.clearConcole(20);
    	System.out.println("Thank you");
    	gameFunc.clearConcole(10);

        
        scanner.close();    
    }
	
	

}