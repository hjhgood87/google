package google.pc.model;

public class MemCommand {
	private int idx;
	private int member_level;
	private String id;
	private String passwd;
	private String name;
	private String cel;
	private String free_date;
	private String pay_date;
	private int point;

	public MemCommand(int idx, int member_level, String id, String passwd, String name, String cel, String free_date,
			String pay_date, int point, String join_date) {
		super();
		this.idx = idx;
		this.member_level = member_level;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.cel = cel;
		this.free_date = free_date;
		this.pay_date = pay_date;
		this.point = point;
		this.join_date = join_date;
	}

	@Override
	public String toString() {
		return "MemCommand [idx=" + idx + ", member_level=" + member_level + ", id=" + id + ", passwd=" + passwd
				+ ", name=" + name + ", cel=" + cel + ", free_date=" + free_date + ", pay_date=" + pay_date + ", point="
				+ point + ", join_date=" + join_date + "]";
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getMember_level() {
		return member_level;
	}

	public void setMember_level(int member_level) {
		this.member_level = member_level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getFree_date() {
		return free_date;
	}

	public void setFree_date(String free_date) {
		this.free_date = free_date;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	private String join_date;
}
