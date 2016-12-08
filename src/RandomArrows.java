import java.util.Random;

//방향키와 관련된 기능들 (생성, 구분 등)
public class RandomArrows 
{
	private char up = 'w', down = 's',
				 left = 'a', right = 'd';

	//배열의 내용을 출력 해 준다.
	public void PrintArr(char[] charArr)
	{
		for(int re = 0; re < charArr.length; re++)
		{
			System.out.print(charArr[re]+" ");
		}
	}
	//Random된 배열을 Return한다.
	public char RandomArr()
	{
		return _RandomArr(Random());
	}
	
	
	//charArr에 랜덤한 값을 넣어준다.
	private char _RandomArr(int randomNum)
	{		
		char result = 'Y';
		result = checkNull(randomNum);
	
		while(result == 'Y')
			checkNull(Random());

		return result;
	}
	
	//Random한 int값을 반환한다.
	private int Random()
	{
		Random random = new Random();
		return random.nextInt(100) * random.nextInt(7);
	}

	//result가 Y인지 확인한다.
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
