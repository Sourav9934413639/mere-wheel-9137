package Model;

public class CoursePlan {
	private int coursePlanId;
	private int dayNumber;
	private String topic;
	private String status;
	public CoursePlan() {}
	public CoursePlan(int coursePlanId, int dayNumber, String topic, String status) {
		super();
		this.coursePlanId = coursePlanId;
		this.dayNumber = dayNumber;
		this.topic = topic;
		this.status = status;
	}
	public int getCoursePlanId() {
		return coursePlanId;
	}
	public void setCoursePlanId(int coursePlanId) {
		this.coursePlanId = coursePlanId;
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
		return "CoursePlan [coursePlanId=" + coursePlanId + ", dayNumber=" + dayNumber + ", topic=" + topic
				+ ", status=" + status + "]";
	}
	
}
