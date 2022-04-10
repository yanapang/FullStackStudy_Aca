package exam14;

import java.util.HashMap;

public class MapTest03 {

	public static void main(String[] args) {
		String []names = {"kim","choi","park","kim","kim","park"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<names.length;i++){
			String name = names[i];
			Integer cnt = map.get(name);
			if(cnt == null) {
				map.put(name, 1);
			} else {
				map.put(name, cnt+1);
			}
		}
		
	}

}
