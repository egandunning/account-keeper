package com.egandunning.beans;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class Backup implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String backupData;
    private String owner;
    private ZonedDateTime createdAt;
    
    public Backup() {}
    
    public Backup(long id, String backupData, String owner,
            ZonedDateTime createdAt) {
        this.id = id;
        this.backupData = backupData;
        this.owner = owner;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBackupData() {
        return backupData;
    }

    public void setBackupData(String backupData) {
        this.backupData = backupData;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Backup [id=" + id + ", backupData=" + backupData + ", owner="
                + owner + ", createdAt=" + createdAt + "]";
    }
}
