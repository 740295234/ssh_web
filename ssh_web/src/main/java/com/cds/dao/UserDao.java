package com.cds.dao;

import com.cds.po.UserEntity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {
    public UserEntity getUser(int id){
        return this.getHibernateTemplate().get(UserEntity.class,id);
    }

    public static void main(String[] args) {

        System.out.println(System.getProperties());
    }
}
