public class LinkedListTest {
    
	linkedListADT list = new linkedListADT();

	
	/*Algorithm
	 * 
	 * 처음 문자열을 생성
	 * 문자열을 초기화
	 * 만약 Y가 있는 경우, 다시돌리기
	 * 문자 확인 후 게임 시작.
	 * 
	 * 사용자의 문자를 받음
	 * 사용자의 문자가 배열이랑 일치?
	 * 
	 * 
	 * */
	
    void IMSI()
    {
    	list.add(300);        
        list.add(100);
        list.addFirst(50);
        System.out.println(list);
        System.out.println(list.get(4));
        
        list.remove(2);
        list.remove(new Integer(50));
        System.out.println(list);
        
//        list.removeFirst();
//        list.removeLast();
        System.out.println("크기 " + list.size());
        
    }
}