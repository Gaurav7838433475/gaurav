package javaprog;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetprog {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("infosys");
		set.add("IBM");
		set.add("wipro");
		set.add("google");
		set.add("microsoft");
		set.add("congnizent");
		set.add("testyantra");
		set.add("wipro");
		System.out.println(set);
		for(String str:set)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("infosys"));
		System.out.println(set.tailSet("google"));
	}

}
