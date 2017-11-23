package com.zhibo.hei_maven.mybatis;

import entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 你 楠哥 。 on 2017/11/23.
 */
public interface AdminDao {
    public List<Admin> selectAll(Admin admin);
    public int insert();
    public void  sss();
    public  String as();
}
