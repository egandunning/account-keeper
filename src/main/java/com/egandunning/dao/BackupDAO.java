package com.egandunning.dao;

import java.util.List;

import com.egandunning.beans.Backup;

/**
 * Backup Data Access Object. Modifying backups is not an option.
 * @author dunning
 *
 */
public interface BackupDAO {

    public List<Backup> getBackups(String owner) throws Exception;
    
    public Backup getBackup(String owner, long id) throws Exception;
    
    public Backup getNewestBackup(String owner) throws Exception;
    
    public void createBackup(Backup backup) throws Exception;
    
    public void deleteBackup(long id) throws Exception;
}
