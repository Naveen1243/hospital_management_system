package pack;

public class Lab {
	private int lab_id;
	private String lab_name;
	private int room_no;
	private String lab_timing;
	Lab(){
		
	}
	
	public Lab(String lab_name, int room_no, String lab_timing) {
		super();
		this.lab_id = lab_id;
		this.lab_name = lab_name;
		this.room_no = room_no;
		this.lab_timing = lab_timing;
	}

	public int getlab_id() {
		return lab_id;
	}
	public void setlab_id(int lab_id) {
		this.lab_id = lab_id;
	}
	public String getlab_name() {
		return lab_name;
	}
	public void setlab_name(String lab_name) {
		this.lab_name = lab_name;
	}
	public int getroom_no() {
		return room_no;
	}
	public void setroom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getlab_timing() {
		return lab_timing;
	}
	public void setlab_timing(String lab_timing) {
		this.lab_timing = lab_timing;
	}
	
	

}

