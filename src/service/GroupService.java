package service;

import model.Group;
import repository.GroupDB;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GroupService {
    GroupDB groupDB;

    public GroupService(){
        this.groupDB = new GroupDB();
    }
    
}
