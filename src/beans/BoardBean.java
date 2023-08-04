package beans;

import java.io.Serializable;

public class BoardBean implements Serializable {
	private int board_num;	//게시물 번호
	private String board_name;	//작성자 이름
	private String board_email;	//이메일
	private String board_homepage;	//홈페이지
	private String board_subject;	//제목
	private String board_content;	//내용
	private int board_pos;	//글의 순서
	private int board_depth;	//답변의 길이
	private String board_regdate;	//등록 날짜
	private String board_pass;	//비밀번호
	private int	board_count;	//조회수
	private String board_ip;	//글쓴이 ip
	private String board_file;	//첨부파일 파일
	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_email() {
		return board_email;
	}
	public void setBoard_email(String board_email) {
		this.board_email = board_email;
	}
	public String getBoard_homepage() {
		return board_homepage;
	}
	public void setBoard_homepage(String board_homepage) {
		this.board_homepage = board_homepage;
	}
	public String getBoard_subject() {
		return board_subject;
	}
	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_pos() {
		return board_pos;
	}
	public void setBoard_pos(int board_pos) {
		this.board_pos = board_pos;
	}
	public int getBoard_depth() {
		return board_depth;
	}
	public void setBoard_depth(int board_depth) {
		this.board_depth = board_depth;
	}
	public String getBoard_regdate() {
		return board_regdate;
	}
	public void setBoard_regdate(String board_regdate) {
		this.board_regdate = board_regdate;
	}
	public String getBoard_pass() {
		return board_pass;
	}
	public void setBoard_pass(String board_pass) {
		this.board_pass = board_pass;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public String getBoard_ip() {
		return board_ip;
	}
	public void setBoard_ip(String board_ip) {
		this.board_ip = board_ip;
	}
	public String getBoard_file() {
		return board_file;
	}
	public void setBoard_file(String board_file) {
		this.board_file = board_file;
	}
	
//	public static void main(String[] args) {
//		
//
//	}

}
