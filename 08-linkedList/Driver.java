public class Driver{
    public static void main(String[] args){
	//Sully
	Node n1 = new Node("Sully");
	System.out.println(n1);
	System.out.println(n1.getNext());

	//Mike
	Node n2 = new Node("Mike");
	System.out.println(n2);
	System.out.println(n2.getNext());

	//set Sully next to Mike
	n1.setNext(n2);
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

	//set Mike next to Randall
	n1.getNext().setNext(new Node("Randall"));
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());

	/* //remove Mike
	n1.setNext(n1.getNext().getNext());
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/

	//set Randall next to Sully
	n1.getNext().getNext().setNext(n1);
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
    }
}