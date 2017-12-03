package dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;


public class MainTestClass {
	public static void main(String[] args) {
		
		List<SearchDocument> list = new ArrayList<>();
		
		list.add(new RealtimeDocument("1", "P0000WE", "YU345", "USA"));
		
		list.add(new MstarDocumentAdapter(new MstarDocument("2", "P000YU", "YE699", "CANADA")));
		
		System.out.println(list);
	}

}
