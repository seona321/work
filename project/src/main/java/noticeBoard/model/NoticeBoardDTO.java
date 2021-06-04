package noticeBoard.model;

import java.util.Date;

public class NoticeBoardDTO {
	private int idx; 
	private String title; 
	private String content; 
	private String writer; 
	private Date writeDate; 
	private int viewcnt; 
	
	public NoticeBoardDTO() {
		super();
	}
	
	public NoticeBoardDTO(int idx, String title, String content, String writer, Date writeDate, int viewcnt) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.viewcnt = viewcnt;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	
}
