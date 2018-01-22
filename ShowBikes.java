import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class ShowBikes {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		File file = new File("bicycle.txt");
		String type = null;
		String sortKey = null;
		if(args.length == 0) {
			System.out.println("Please Enter Valid Arguments.");
			return;
		}
		
		if (args.length % 2 == 0) {
			System.out.println("Please Enter Valid Arguments.");
			return;
		}
		
		HashMap<String, String> fHm = new HashMap<>();
		for(int i=0; i < args.length-1; i+=2) {
			String key = args[i];
			if (key.equals("-gear") || key.equals("-height") || key.equals("-wheelbase") || key.equals("-type") || key.equals("-color") || key.equals("-material")) {
				fHm.put(key, args[i+1]);
	        }else {
	        	System.out.println("Please Arguments in Valid order as Follows\n"
	        			+ "java ShowBikes -key value -key value -sortKey");
	        	return;
	        }
			
		}
		
		sortKey = args[args.length-1];
		sortKey = sortKey.substring(1, sortKey.length());
		
        if (sortKey.equals("gear") || sortKey.equals("height") || sortKey.equals("wheelbase") || sortKey.equals("type") || sortKey.equals("color") || sortKey.equals("material")) {
        	
        }else {
        	System.out.println("Please Enter Valid Key to Sort.");
        	return;
        }
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	 String[] bikeElements = line.split(",");
		    	 BiCycle bikes = new BiCycle(bikeElements[0],bikeElements[4],bikeElements[5],Integer.parseInt(bikeElements[1]),Integer.parseInt(bikeElements[3]),Integer.parseInt(bikeElements[2]));
				 if (bikes.filter(fHm))
					 list.add(bikes);
		    }
		    
		    list.sortByKey(sortKey);
		    list.printList();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
