package beans;

import java.io.Serializable;

public class ZipcodeBean implements Serializable {
	private String zipcode;	// 우편번호
	private String sido;	// 특별시,광역시, 도
	private String gugun;	// 시, 군, 구
	private String dong;	// 읍,면,동,리,건물명
	private String bunji;	// 번지, 아파트동, 호수
	private String seq;	// 데이터 순서
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}

}
