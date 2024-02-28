package hashtable;

public class Student {
	private int studId;
	private String studName;
	private int score;
	
	public Student(int studId, String studName, int score) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.score = score;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", score=" + score + "]";
	}
}
