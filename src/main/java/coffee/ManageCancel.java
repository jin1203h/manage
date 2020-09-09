package coffee;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="ManageCancel_table")
public class ManageCancel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long mCancelid;
    private Long requestId;
    private String status;
    private String mCancelTime;

    @PostPersist
    public void onPostPersist(){
        ManageCanceled manageCanceled = new ManageCanceled();
        BeanUtils.copyProperties(this, manageCanceled);
        manageCanceled.publishAfterCommit();


    }


    public Long getMCancelid() {
        return mCancelid;
    }

    public void setMCancelid(Long mCancelid) {
        this.mCancelid = mCancelid;
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
