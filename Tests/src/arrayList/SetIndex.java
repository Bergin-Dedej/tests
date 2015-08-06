package arrayList;

import java.util.ArrayList;

public class SetIndex {
	public static void main(String[] args){
		ArrayList<String> username = new ArrayList<String>();
		//username.set(0, "MyUsername"); you cant do this
		username.add(0, "MyUsername");
		System.out.println(username);
	}
}
