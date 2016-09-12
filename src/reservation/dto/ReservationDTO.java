package reservation.dto;

public class ReservationDTO {
	private int branch_id;
	private int room_id;
	private String reserve_date;
	private String reserve_time;
	private String id;
	private String reserve_name;
	private String reserve_phon;
	private String email;
	private int reserve_people;
	private String reserve_freind;
	private String profit;
	private String cleartime;
	
	
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getReserve_date() {
		return reserve_date;
	}
	public void setReserve_date(String reserve_date) {
		this.reserve_date = reserve_date;
	}
	public String getReserve_time() {
		return reserve_time;
	}
	public void setReserve_time(String reserve_time) {
		this.reserve_time = reserve_time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReserve_name() {
		return reserve_name;
	}
	public void setReserve_name(String reserve_name) {
		this.reserve_name = reserve_name;
	}
	public String getReserve_phon() {
		return reserve_phon;
	}
	public void setReserve_phon(String reserve_phon) {
		this.reserve_phon = reserve_phon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getReserve_people() {
		return reserve_people;
	}
	public void setReserve_people(int reserve_people) {
		this.reserve_people = reserve_people;
	}
	public String getReserve_freind() {
		return reserve_freind;
	}
	public void setReserve_freind(String reserve_freind) {
		this.reserve_freind = reserve_freind;
	}
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}
	public String getCleartime() {
		return cleartime;
	}
	public void setCleartime(String cleartime) {
		this.cleartime = cleartime;
	}
	
	
}
