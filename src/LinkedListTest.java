public class LinkedListTest {
    
	linkedListADT list = new linkedListADT();

	
	/*Algorithm
	 * 
	 * ó�� ���ڿ��� ����
	 * ���ڿ��� �ʱ�ȭ
	 * ���� Y�� �ִ� ���, �ٽõ�����
	 * ���� Ȯ�� �� ���� ����.
	 * 
	 * ������� ���ڸ� ����
	 * ������� ���ڰ� �迭�̶� ��ġ?
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
        System.out.println("ũ�� " + list.size());
        
    }
}