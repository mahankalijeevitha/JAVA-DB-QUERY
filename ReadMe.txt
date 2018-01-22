********************************
Usage:
********************************
java ShowBikes -type street_bike -color red -wheelbase




********************************
Keys to be passed as arguments
********************************
Type – type
Color – color
Construction Material – material
Height – height
Wheel Base – wheelbase
No of Gears – gear



********************************
Note: 
********************************
•Arguments length should be Odd number
•Arguments can be passed in any order but last argument will be used for Sorting



********************************
Classes
********************************

BiCycle{
        private String type,color,constructionMaterial;
	private int noOfGears,height,wheelBase;
}

Node{
       BiCycle data;
       Node next;
}

LinkedList{
	Node head;
	Node tail;
	int size;

	void add();
}


