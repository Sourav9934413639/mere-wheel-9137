package Model;

public class GenerateReportOfBatchDTO {
	private int batchId;
	private String batchStartDate;
	private int dayNumber;
	private String status;
	public GenerateReportOfBatchDTO() {}
	public GenerateReportOfBatchDTO(int batchId, String batchStartDate, int dayNumber, String status) {
		super();
		this.batchId = batchId;
		this.batchStartDate = batchStartDate;
		this.dayNumber = dayNumber;
		this.status = status;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GenerateReportOfBatchDTO [batchId=" + batchId + ", batchStartDate=" + batchStartDate + ", dayNumber="
				+ dayNumber + ", status=" + status + "]";
	}
	
}
