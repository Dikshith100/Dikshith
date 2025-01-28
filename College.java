
public class College {
	private String Name;
	private String address;
	private int courses;
	private int rank;
	private int fees;
	private String placements;
	public College(String name, String address, int courses, int rank, int fees, String placements) {
		super();
		Name = name;
		this.address = address;
		this.courses = courses;
		this.rank = rank;
		this.fees = fees;
		this.placements = placements;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCourses() {
		return courses;
	}
	public void setCourses(int courses) {
		this.courses = courses;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getPlacements() {
		return placements;
	}
	public void setPlacements(String placements) {
		this.placements = placements;
	}
	
	
}
