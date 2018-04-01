package com.egandunning.app;

import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egandunning.beans.Backup;

@RestController
@RequestMapping("/backup")
public class BackupController {

    //delete when DAOs are implemented
    private static Backup dummyData = new Backup(1, "data", "me", ZonedDateTime.now());
    
    @RequestMapping(method=RequestMethod.GET)
    public Backup[] getBackups() {
        return new Backup[]{dummyData};
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Backup getBackup(@PathVariable(value="id") String id) {
        return dummyData;
    }
    
    @RequestMapping(value="/newest", method=RequestMethod.GET)
    public Backup getNewestBackup() {
        return dummyData;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public Backup postBackup(@RequestBody Backup backup) {
        return backup;
    }
}
