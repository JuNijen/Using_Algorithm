//import linkedListADT.Node;
public class linkedListADT
{
	private Node nodeFirst;
    private int nodeIndex;
    
    public linkedListADT()
    {    
        nodeFirst = new Node(null);
        nodeIndex = 0;
    }
    
    
    // 단순 연결 리스트 노드
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
    
    // index 위치의 노드 데이터를 반환한다.
    public Object getNode(int index)
    {
        return _getNode(index).data;
    }
    
    // index 위치의 노드를 반환한다.
    private Node _getNode(int index)
    {
        if(index < 0 || index >= nodeIndex)
        {
            throw new IndexOutOfBoundsException
            		("Index : " + index + ", Size : " + nodeIndex);
        }
        
        Node node = nodeFirst.nextNode;
        for(int i =0; i < index; i++)
        {
            node = node.nextNode;
        }
        
        return node;
    }
    
    // 첫번째 노드의 데이터를 반환한다.
    public Object getNodeIndexFirst()
    {
        return getNode(0);
    }
    
    // 해당 데이터의 노드 위치 index를 반환한다.
    public int getNodeIndex(Object obj)
    {
        if(nodeIndex<=0){
            return -1;
        }
        
        int index=0;
        Node node = nodeFirst.nextNode;
        Object nodeData = node.data;
        
        // header에서 부터 순차적으로 nodeData와 값을 비교한다.
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
    
    // data를 리스트의 첫번째에 삽입한다.
    public void addDataFirst(Object data)
    {
        Node newNode = new Node(data);
        newNode.nextNode = nodeFirst.nextNode;
        nodeFirst.nextNode = newNode;
        nodeIndex++;
    }
    
    // index 위치에 data를 삽입한다.
    public void addData(int index, Object data)
    { 
        if(index==0)
        {
            addDataFirst(data);
            return;
        }
        Node previous = _getNode(index-1);
        Node next = previous.nextNode;
        
        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        nodeIndex++;
    }
    
    // 리스트의 마지막에 data 를 삽입한다.
    public void addLast(Object data)
    {
        addData(nodeIndex, data);
    }
    public void add(Object data)
    {
        addLast(data);
    }
    
    // 첫번째 노드를 제거하고 데이터를 반환한다.
    public Object removeFirst()
    {
        Node firstNode = _getNode(0);
        firstNode.nextNode = firstNode.nextNode;
        nodeIndex--;
        return firstNode.data;
    }
    
    // index 위치의 노드를 제거, 데이터를 반환
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
        
        Node previous = _getNode(index-1);
        Node removeNode = previous.nextNode;
        Node next = removeNode.nextNode;
        previous.nextNode = next;
        nodeIndex--;
        
        return removeNode.data;
    }
    
    // 리스트에서 data를 가진 노드를 제거하고 제거여부를 반환한다.
    public boolean removeData(Object data)
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
    
    // 리스트의 마지막 노드를 제거하고 데이터를 반환한다.
    public Object removeLast()
    {
        return remove(nodeIndex-1);
    }
    
    // 리스트의 크기를 반환한다.
    public int getSize()
    {
        return nodeIndex;
    }
}