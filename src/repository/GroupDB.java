package repository;

import model.Group;

import java.util.HashMap;

public class GroupDB {
    int[] arr = new int [n];

    HashMap<Integer, Group> groupMap;
    public GroupDB(){
        this.groupMap = new HashMap<>();
    }

    public int tellTotalGroups(){
        return this.groupMap.size();
    }

    public void saveGroup(Group group){
        groupMap.put(group.getId(), group);
    }
}
