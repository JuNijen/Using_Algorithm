//import linkedListADT.Node;
public class linkedListADT {
	private Node nodeFirst;
    private int nodeIndex;
    
    public linkedListADT()
    {    
        nodeFirst = new Node(null);
        nodeIndex = 0;
    }
    
    
    // �ܼ� ���� ����Ʈ ���
    private class Node
    {
        private Object data;
        private Node nextNode;
        
        Node(Object data)
        { 
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // index ��ġ�� ��� �����͸� ��ȯ�Ѵ�.
    public Object get(int index)
    {
        return getNode(index).data;
    }
    
    // index ��ġ�� ��带 ��ȯ�Ѵ�.
    private Node getNode(int index)
    {
        if(index < 0 || index >= nodeIndex)
        {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + nodeIndex);
        }
        
        Node node = nodeFirst.nextNode;
        for(int i =0; i < index; i++)
        {
            node = node.nextNode;
        }
        
        return node;
    }
    
    // ù��° ����� �����͸� ��ȯ�Ѵ�.
    public Object getFirst()
    {
        return get(0);
    }
    
    // �ش� �������� ��� ��ġ index�� ��ȯ�Ѵ�.
    public int getNodeIndex(Object obj)
    {
        if(nodeIndex<=0){
            return -1;
        }
        
        int index=0;
        Node node = nodeFirst.nextNode;
        Object nodeData = node.data;
        
        // header���� ���� ���������� nodeData�� ���� ���Ѵ�.
        while(!obj.equals(nodeData))
        {
            node = node.nextNode;
            if(node==null)
            {
                return -1;
            }
            nodeData = node.data;
            index++;
        }
        return index;
    }
    
    // data�� ����Ʈ�� ù��°�� �����Ѵ�.
    public void addFirst(Object data)
    {
        Node newNode = new Node(data);
        newNode.nextNode = nodeFirst.nextNode;
        nodeFirst.nextNode = newNode;
        nodeIndex++;
    }
    
    // index ��ġ�� data�� �����Ѵ�.
    public void add(int index, Object data)
    { 
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node previous = getNode(index-1);
        Node next = previous.nextNode;
        
        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        nodeIndex++;
    }
    
    // ����Ʈ�� �������� data �� �����Ѵ�.
    public void addLast(Object data)
    {
        add(nodeIndex, data);
    }
    // ����Ʈ�� �������� data�� �����Ѵ�.
    public void add(Object data)
    {
        addLast(data);
    }
    
    // ù��° ��带 �����ϰ� �����͸� ��ȯ�Ѵ�.
    public Object removeFirst()
    {
        Node firstNode = getNode(0);
        firstNode.nextNode = firstNode.nextNode;
        nodeIndex--;
        return firstNode.data;
    }
    
    // index ��ġ�� ��带 �����ϰ� �����͸� ��ȯ�Ѵ�.
    public Object remove(int index)
    {
        if(index<0 || index>=nodeIndex)
        {
            throw new IndexOutOfBoundsException
            	("Index : " + index + ", Size : " +nodeIndex);
        }else if(index ==0)
        {
            return removeFirst();
        }
        
        Node previous = getNode(index-1);
        Node removeNode = previous.nextNode;
        Node next = removeNode.nextNode;
        previous.nextNode = next;
        nodeIndex--;
        
        return removeNode.data;
    }
    
    // ����Ʈ���� data�� ���� ��带 �����ϰ� ���ſ��θ� ��ȯ�Ѵ�.
    public boolean remove(Object data)
    {
        int nodeIndex = getNodeIndex(data);
        
        if(nodeIndex == -1)
        {
            return false;
        }
        else
        {
            remove(nodeIndex);
            return true;
        }
    }
    
    // ����Ʈ�� ������ ��带 �����ϰ� �����͸� ��ȯ�Ѵ�.
    public Object removeLast()
    {
        return remove(nodeIndex-1);
    }
    
    // ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�.
    public int size()
    {
        return nodeIndex;
    }
}