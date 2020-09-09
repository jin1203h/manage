package coffee;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Manage_table")
public class Manage {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long manageId;
    private Long requestId;
    private String status;
    private String manageTime;

    @PostPersist
    public void onPostPersist(){
        Managed managed = new Managed();
        BeanUtils.copyProperties(this, managed);
        managed.publishAfterCommit();


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
