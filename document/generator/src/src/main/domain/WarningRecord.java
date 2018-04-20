package src.main.domain;

import java.util.Date;

public class WarningRecord {
    private Long id;

    private Date lastAcceptTime;

    private Date warningTime;

    private String status;

    private String dealType;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastAcceptTime() {
        return lastAcceptTime;
    }

    public void setLastAcceptTime(Date lastAcceptTime) {
        this.lastAcceptTime = lastAcceptTime;
    }

    public Date getWarningTime() {
        return warningTime;
    }

    public void setWarningTime(Date warningTime) {
        this.warningTime = warningTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}