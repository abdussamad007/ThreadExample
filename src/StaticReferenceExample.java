import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;


public class StaticReferenceExample {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Abdus");
	names.add("Cinthia");
	names.add("Aarshiya");
	
	names.forEach(System.out::println);
	
}
}
