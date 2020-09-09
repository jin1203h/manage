package coffee;

public class ManageCanceled extends AbstractEvent {

    private Long mCancelId;
    private Long requestId;
    private String status;
    private String mCancelTime;

    public ManageCanceled(){
        super();
    }

    public Long getMCancelId() {
        return mCancelId;
    }

    public void setMCancelId(Long mCancelId) {
        this.mCancelId = mCancelId;
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
    public String getMCancelTime() {
        return mCancelTime;
    }

    public void setMCancelTime(String mCancelTime) {
        this.mCancelTime = mCancelTime;
    }
}
