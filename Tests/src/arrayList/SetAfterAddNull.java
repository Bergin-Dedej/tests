package arrayList;

import java.util.ArrayList;

public class SetAfterAddNull {
	
	
	public static void main(String[] args){
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(null);
		arrayList.set(0,"something");
		
		System.out.println(arrayList);
	}
}
