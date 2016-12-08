//It will be used by ActivityMain
public class ActivityFunc {

	InputKeycode inputKC = new InputKeycode();
	RandomArrows randomArr = new RandomArrows();
	
	//화면을 지워준다.
	public void clearConcole(int lineNum)
	{
		for(int re = 0; re < lineNum; ++re)
			System.out.println();
	}
	
	public void KeyInput(char _keyInput)
    {
		inputKC.pKeyInput(_keyInput);
    }
	public char InitArr()
	{
		return randomArr.RandomArr();
	}
	public void DebugArr(char[] _charArr)
	{
		randomArr.PrintArr(_charArr);
	}
	
}
