package dbtable;

public class reponse {

	private int reponseId;
	private int questionId;
	private String reponseLib;
	private boolean correct;
	
	
	public reponse(int reponseId, int questionId, String reponseLib, boolean correct) {
		super();
		this.reponseId = reponseId;
		this.questionId = questionId;
		this.reponseLib = reponseLib;
		this.correct = correct;
	}
	public reponse() {
		super();
	}
	public int getReponseId() {
		return reponseId;
	}
	public void setReponseId(int reponseId) {
		this.reponseId = reponseId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getReponseLib() {
		return reponseLib;
	}
	public void setReponseLib(String reponseLib) {
		this.reponseLib = reponseLib;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
}
