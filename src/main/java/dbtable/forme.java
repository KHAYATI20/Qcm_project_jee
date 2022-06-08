package dbtable;

public class forme {
	private int formeId ;
	private String formeLib ;
	
	
	public forme() {
		super();
	}
	public forme(int formeId, String formeLib) {
		super();
		this.formeId = formeId;
		this.formeLib = formeLib;
	}
	public int getFormeId() {
		return formeId;
	}
	public void setFormeId(int formeId) {
		this.formeId = formeId;
	}
	public String getFormeLib() {
		return formeLib;
	}
	public void setFormeLib(String formeLib) {
		this.formeLib = formeLib;
	}
	

}
