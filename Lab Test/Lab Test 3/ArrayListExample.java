import java.util.ArrayList;



public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("abc");
		arraylist.add("def");
		arraylist.add("def");
		arraylist.add(3,"asms");
		arraylist.remove(2);
		arraylist.set(2,"msd");
		System.out.println(arraylist);

	}

}
