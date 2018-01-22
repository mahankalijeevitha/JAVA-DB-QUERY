
public class Node {
	BiCycle data;
	Node next;
	public Node(BiCycle data) {
		super();
		this.data = data;
	}
	
	public int getIntValue(String key) {
		//noOfGears,height,wheelBase
		if (key.equals("gear")) {
			return data.getNoOfGears();
		}else if (key.equals("height")) {
			return data.getHeight();
		}else if (key.equals("wheelbase")) {
			return data.getWheelBase();
		}
		return 0;
	}
	
    public String getStringValue(String key) {
    	if (key.equals("type")) {
			return data.getType();
		}else if (key.equals("color")) {
			return data.getColor();
		}else if (key.equals("material")) {
			return data.getConstructionMaterial();
		}
		return "";
	}
}
