import java.util.Random;

//����Ű�� ���õ� ��ɵ� (����, ���� ��)
public class RandomArrows 
{
	private char up = 'w', down = 's',
				 left = 'a', right = 'd';

	//�迭�� ������ ��� �� �ش�.
	public void PrintArr(char[] charArr)
	{
		for(int re = 0; re < charArr.length; re++)
		{
			System.out.print(charArr[re]+" ");
		}
	}
	//Random�� �迭�� Return�Ѵ�.
	public char RandomArr()
	{
		return _RandomArr(Random());
	}
	
	
	//charArr�� ������ ���� �־��ش�.
	private char _RandomArr(int randomNum)
	{		
		char result = 'Y';
		result = checkNull(randomNum);
	
		while(result == 'Y')
			checkNull(Random());

		return result;
	}
	
	//Random�� int���� ��ȯ�Ѵ�.
	private int Random()
	{
		Random random = new Random();
		return random.nextInt(100) * random.nextInt(7);
	}

	//result�� Y���� Ȯ���Ѵ�.
	private char checkNull(int _randomNum)
	{
		char result = 'Y';
		
		switch(_randomNum % 4)
		{
		case 0:
			result = up;
		case 1:
			result = down;
		case 2:
			result = left;
		case 3:
			result = right;
		}
		return result;
	}
}
