package google.pc.model;

import java.util.Date;

public class SalesCommand {
	private int idx;
	private String gubun;
	private int incom;
	private Date date_sale;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public int getIncom() {
		return incom;
	}
	public void setIncom(int incom) {
		this.incom = incom;
	}
	public Date getDate_sale() {
		return date_sale;
	}
	public void setDate_sale(Date date_sale) {
		this.date_sale = date_sale;
	}
	@Override
	public String toString() {
		return "TotalSales [idx=" + idx + ", gubun=" + gubun + ", incom=" + incom + ", date_sale=" + date_sale + "]";
	}
	public SalesCommand(int idx, String gubun, int incom, Date date_sale) {
		super();
		this.idx = idx;
		this.gubun = gubun;
		this.incom = incom;
		this.date_sale = date_sale;
	}
	
	
}
