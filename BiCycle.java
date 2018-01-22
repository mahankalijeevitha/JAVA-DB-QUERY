import java.util.HashMap;

public class BiCycle {
	
	private String type,color,constructionMaterial;
	private int noOfGears,height,wheelBase;
	
	private HashMap<String, String> hm;
	
	public BiCycle(String type, String color, String constructionMaterial, int noOfGears, int height, int wheelBase) {
		super();
		this.type = type;
		this.color = color;
		this.constructionMaterial = constructionMaterial;
		this.noOfGears = noOfGears;
		this.height = height;
		this.wheelBase = wheelBase;
		
		hm = new HashMap<>();
		
		hm.put("-type", type);
		hm.put("-color", color);
		hm.put("-material", constructionMaterial);
		hm.put("-gear", noOfGears+"");
		hm.put("-height", height+"");
		hm.put("-wheelbase", wheelBase+"");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getConstructionMaterial() {
		return constructionMaterial;
	}
	public void setConstructionMaterial(String constructionMaterial) {
		this.constructionMaterial = constructionMaterial;
	}
	public int getNoOfGears() {
		return noOfGears;
	}
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWheelBase() {
		return wheelBase;
	}
	public void setWheelBase(int wheelBase) {
		this.wheelBase = wheelBase;
	}
	@Override
	public String toString() {
		return "BiCycle [type=" + type + ", color=" + color + ", constructionMaterial=" + constructionMaterial
				+ ", noOfGears=" + noOfGears + ", height=" + height + ", wheelBase=" + wheelBase + "]";
	}
	
	public boolean filter(HashMap<String, String> fHm){
		for (String key: fHm.keySet()) {
			if (!hm.get(key).equals(fHm.get(key))) {
				return false;
			}
		}
		return true;
	}
}
