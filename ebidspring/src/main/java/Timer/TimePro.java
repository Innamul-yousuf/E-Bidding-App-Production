package Timer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TimePro {
	@Id
private int pid;
	
	private int time;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
}
