package com.cds.action;


import com.cds.po.UserEntity;
import com.cds.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        UserEntity userEntity = userService.getUser(1);
        System.out.println("测试struts2 : "+userEntity);
        return "test";
    }
}
