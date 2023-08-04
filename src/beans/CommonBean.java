package beans;

import java.io.Serializable;

public class CommonBean implements Serializable {
	private String comm_cd;	// common 코드
	private String comm_nm;	// common 이름
	public String getComm_cd() {
		return comm_cd;
	}
	public void setComm_cd(String comm_cd) {
		this.comm_cd = comm_cd;
	}
	public String getComm_nm() {
		return comm_nm;
	}
	public void setComm_nm(String comm_nm) {
		this.comm_nm = comm_nm;
	}
	
}
