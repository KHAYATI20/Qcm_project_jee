package dbtable;

public class question {
	
	private int questionId ;
	private int formeId ;
	private String questionLib ;
	
	public question() {
		super();
	}
	public question(int questionId, int formeId, String questionLib) {
		super();
		this.questionId = questionId;
		this.formeId = formeId;
		this.questionLib = questionLib;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getFormeId() {
		return formeId;
	}
	public void setFormeId(int formeId) {
		this.formeId = formeId;
	}
	public String getQuestionLib() {
		return questionLib;
	}
	public void setQuestionLib(String questionLib) {
		this.questionLib = questionLib;
	}

}
