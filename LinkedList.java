
public class LinkedList {
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	private String sortKey = "";

	public void add(BiCycle data) {
		Node node=new Node(data);

		if(head==null) {
			head=node;
			tail=node;
		}
		else if(size==1) {
			head.next=node;
			tail=head.next;
			
		}
		else {
			tail.next=node;
			tail=tail.next;
		}
		size++;
	}
	public void printList() {
		Node temp=head;
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		head = temp;
	}
	public void sortByKey(String key) {
		this.sortKey = key;
		
		head = mergeSort(head);
		
	}
	
	//Merge Sort for Int values
	Node sortedMerge(Node a, Node b) 
    {
		Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.getIntValue(sortKey) <= b.getIntValue(sortKey)) 
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        } 
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
 
    }
	
	Node sortedStringMerge(Node a, Node b) 
    {
		Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.getStringValue(sortKey).compareTo(b.getStringValue(sortKey))<0) 
        {
            result = a;
            result.next = sortedStringMerge(a.next, b);
        } 
        else
        {
            result = b;
            result.next = sortedStringMerge(a, b.next);
        }
        return result;
 
    }
	
	private Node mergeSort(Node h) {
		if (head == null || h.next == null)
			return h;
		
		Node middle = getMiddle(h);
		Node nextofmiddle = middle.next;
 
        // set the next of middle node to null
        middle.next = null;
 
        // Apply mergeSort on left list
        Node left = mergeSort(h);
 
        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);
 
        Node sortedlist = null;
        // Merge the left and right lists
        if (sortKey.equals("gear") || sortKey.equals("height") || sortKey.equals("wheelbase")) {
        	sortedlist = sortedMerge(left, right);
		}else {
			sortedlist = sortedStringMerge(left, right);
		}
        
        return sortedlist;
	}
	
	private Node getMiddle(Node h) 
    {
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;

        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }
}
