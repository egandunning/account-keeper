package com.egandunning.dao;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.egandunning.beans.Backup;

public class BackupDAOImpl implements BackupDAO {

    static ArrayList<Backup> backups;
    
    static {
        backups = new ArrayList<>();
        backups.add(new Backup(1, "123456seven", "me", ZonedDateTime.now()));
        backups.add(new Backup(2, "datadatadata", "me", ZonedDateTime.now()));
        backups.add(new Backup(3, "moredata", "you", ZonedDateTime.now()));
    }
    
    @Override
    public List<Backup> getBackups(String owner) throws Exception {
        
        List<Backup> yourBackups = new ArrayList<>();
        for(Backup b : backups) {
            if(b.getOwner().equals(owner)) {
                yourBackups.add(b);
            }
        }
        
        return yourBackups;
    }

    @Override
    public Backup getBackup(String owner, long id) throws Exception {
        
        for(Backup b : backups) {
            if(b.getId() == id && b.getOwner().equals(owner)) {
                return b;
            }
        }
        
        return null;
    }

    @Override
    public Backup getNewestBackup(String owner) throws Exception {

        Backup oldest = null;
        
        for(Backup b : backups) {
            if(b.getOwner().equals(owner)) {
                if(oldest == null) {
                    oldest = b;
                    continue;
                }
                if(b.getCreatedAt() != null && b.getCreatedAt().isAfter(oldest.getCreatedAt())) {
                    oldest = b;
                }
            }
        }
        
        return oldest;
    }

    @Override
    public void createBackup(Backup backup) throws Exception {
        backups.add(backup);
    }

    @Override
    public void deleteBackup(long id) throws Exception {
        
        ArrayList<Backup> newList = new ArrayList<>();
        
        for(Backup b : backups) {
            if(b.getId() == id) {
                continue;
            }
            newList.add(b);
        }
        
        backups.clear();
        backups.addAll(newList);
    }
}
