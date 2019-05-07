package com.msj.demo10;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    List userList;
    Set userSet;
    Map userMap;
    Properties userPro;

    //List
    public List getUserList() {
        System.out.println("userList:"+userList);
        return userList;
    }

    public void setUserList(List userList) {
        this.userList = userList;
    }

    //Set
    public Set getUserSet() {
        System.out.println("userSet:"+userSet);
        return userSet;
    }

    public void setUserSet(Set userSet) {
        this.userSet = userSet;
    }

    //Map
    public Map getUserMap() {
        System.out.println("userMap:"+userMap);
        return userMap;
    }

    public void setUserMap(Map userMap) {
        this.userMap = userMap;
    }

    //Properties
    public Properties getUserPro() {
        System.out.println("userPro:"+userPro);
        return userPro;
    }


    public void setUserPro(Properties userPro) {
        this.userPro = userPro;
    }
}
