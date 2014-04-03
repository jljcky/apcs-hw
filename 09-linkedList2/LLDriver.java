public class LLDriver{
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	System.out.println(L);
	System.out.println(L.length());
	
	System.out.println();

	L.add("Sully");
	System.out.println(L);
	System.out.println(L.length());

	System.out.println();

	L.add("Mike");
	System.out.println(L);
	System.out.println(L.length());

	System.out.println();

	L.add("Randall");
	System.out.println(L);
	System.out.println(L.length());

	System.out.println();

	L.add("Boo");
	System.out.println(L);
	System.out.println(L.length());

	System.out.println();

	System.out.println(L.get(1));
	System.out.println(L.get(3));
	System.out.println(L.get(2));
	System.out.println(L.get(0));
	System.out.println(L.get(10));

	System.out.println();

	System.out.println(L.remove(3));
	System.out.println(L);
	System.out.println(L.remove(0));
	System.out.println(L);
	System.out.println(L.remove(10));
	System.out.println(L);

	System.out.println();

	System.out.println(L);
	System.out.println(L.set(0,"Bob"));
	System.out.println(L);
	System.out.println(L.set(1,"Annie"));
	System.out.println(L);
	System.out.println(L.set(10,"Tom"));
	System.out.println(L);

	System.out.println();

	L.add(0,"Joe");
	System.out.println(L);
	L.add(1,"Carl");
	System.out.println(L);
	L.add(10,"Kenny");
	System.out.println(L);
	

	System.out.println();

	System.out.println("Bob");
	System.out.println(L.find("Bob"));
	System.out.println("Joe");
	System.out.println(L.find("Joe"));
	System.out.println("Annie");
	System.out.println(L.find("Annie"));
	System.out.println("Carl");
	System.out.println(L.find("Carl"));
	System.out.println("George");
	System.out.println(L.find("George"));
    }
}
