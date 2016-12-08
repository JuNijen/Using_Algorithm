public class InputKeycode
{
	//private 메서드에 접근하기 위한 함수.
	public void pKeyInput(char keyInput)
    {
   		_keyInput(keyInput);
    }
	//키를 받은 값에 따라
	private void _keyInput(char keyInput)
    {
//    	char up = 38, down = 39,
//    		 left = 37, right = 40;
    	char up = 'w', down = 's',
       		 left = 'a', right = 'd';
    	
        if (keyInput == up)
        	_keyUp();
        else if (keyInput == down)
        	_keyDown();
        else if (keyInput == left)
        	_keyLeft();
        else if (keyInput == right)
        	_keyRight();
        //잘못 된 값일 경우 에러 값 출력, 추후 로그로, 입력은 반복으로 바꿀 예정.
        else
        	System.out.println("It is wrong key");
    }
	
	//방향 키가 Up일 때
    private void _keyUp()
    {
    	System.out.println("VK_UP");    	
    }
	//방향 키가 Down일 때
    private void _keyDown()
    {
    	System.out.println("VK_DOWN");    	
    }
	//방향 키가 Left일 때
    private void _keyLeft()
    {
    	System.out.println("VK_LEFT");	
    }
	//방향 키가 Right일 때
    private void _keyRight()
    {
    	System.out.println("VK_RIGHT");
    }
    
}