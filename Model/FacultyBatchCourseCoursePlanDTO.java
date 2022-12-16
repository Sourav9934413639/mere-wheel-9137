package Model;

public class FacultyBatchCourseCoursePlanDTO {
	private int facultyId;
	private int facultyName;
	private int batchId;
	private String courseName;
	private int dayNumber;
	private String topic;
	private String status;
	public FacultyBatchCourseCoursePlanDTO() {}
	public FacultyBatchCourseCoursePlanDTO(int facultyId, int facultyName, int batchId, String courseName,
			int dayNumber, String topic, String status) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.batchId = batchId;
		this.courseName = courseName;
		this.dayNumber = dayNumber;
		this.topic = topic;
		this.status = status;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public int getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(int facultyName) {
		this.facultyName = facultyName;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FacultyBatchCourseCoursePlanDTO [facultyId=" + facultyId + ", facultyName=" + facultyName + ", batchId="
				+ batchId + ", courseName=" + courseName + ", dayNumber=" + dayNumber + ", topic=" + topic + ", status="
				+ status + "]";
	}
	
}
