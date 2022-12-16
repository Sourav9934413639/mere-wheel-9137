package Model;

public class Batch {
	private int batchId;
	private int totalNumberOfStudents;
	private String batchStartDate;
	private String durationOfCourse;
	public Batch() {}
	public Batch(int batchId, int totalNumberOfStudents, String batchStartDate, String durationOfCourse) {
		super();
		this.batchId = batchId;
		this.totalNumberOfStudents = totalNumberOfStudents;
		this.batchStartDate = batchStartDate;
		this.durationOfCourse = durationOfCourse;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getTotalNumberOfStudents() {
		return totalNumberOfStudents;
	}
	public void setTotalNumberOfStudents(int totalNumberOfStudents) {
		this.totalNumberOfStudents = totalNumberOfStudents;
	}
	public String getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public String getDurationOfCourse() {
		return durationOfCourse;
	}
	public void setDurationOfCourse(String durationOfCourse) {
		this.durationOfCourse = durationOfCourse;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", totalNumberOfStudents=" + totalNumberOfStudents + ", batchStartDate="
				+ batchStartDate + ", durationOfCourse=" + durationOfCourse + "]";
	}
	
}
