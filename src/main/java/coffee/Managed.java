package coffee;

public class Managed extends AbstractEvent {

    private Long manageId;
    private Long requestId;
    private String status;
    private String manageTime;

    public Managed(){
        super();
    }

    public Long getManageId() {
        return manageId;
    }

    public void setManageId(Long manageId) {
        this.manageId = manageId;
    }
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getManageTime() {
        return manageTime;
    }

    public void setManageTime(String manageTime) {
        this.manageTime = manageTime;
    }
}
