public class InputKeycode
{
	
	private char up = 'w', down = 's',
      		     left = 'a', right = 'd'; 
	
	//private �޼��忡 �����ϱ� ���� �Լ�.
	public void pKeyInput(char keyInput)
    {
   		_keyInput(keyInput);
    }
	//Ű�� ���� ���� ����
	private void _keyInput(char keyInput)
    {
//    	char up = 38, down = 39,
//    		 left = 37, right = 40;
    	
        if (keyInput == up)
        	_keyUp();
        else if (keyInput == down)
        	_keyDown();
        else if (keyInput == left)
        	_keyLeft();
        else if (keyInput == right)
        	_keyRight();
        //�߸� �� ���� ��� ���� �� ���, ���� �α׷�, �Է��� �ݺ����� �ٲ� ����.
        else
        	System.out.println("It is wrong key");
    }
	
	//���� Ű�� Up�� ��
    private void _keyUp()
    {
    	System.out.println("VK_UP");    	
    }
	//���� Ű�� Down�� ��
    private void _keyDown()
    {
    	System.out.println("VK_DOWN");    	
    }
	//���� Ű�� Left�� ��
    private void _keyLeft()
    {
    	System.out.println("VK_LEFT");	
    }
	//���� Ű�� Right�� ��
    private void _keyRight()
    {
    	System.out.println("VK_RIGHT");
    }
    
    //���� ���� ����Ű�� ���
    public void PrintArrow(char arrowKey)
    {
    	if (arrowKey == up)
    	{
        	System.out.println("�� ");
        }
        else if (arrowKey == down)
        {
        	System.out.println("�� ");
        }
        else if (arrowKey == left)
        {
        	System.out.println("�� ");
        }
        else if (arrowKey == right)
        {
        	System.out.println("�� ");
        }
    }
    //��ġ�ϴ��� üũ
    private boolean IsCorrect(char arrowKey)
    {
    	return true;
    }
}