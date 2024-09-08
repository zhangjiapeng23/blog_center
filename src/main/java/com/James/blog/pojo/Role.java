//package com.James.blog.pojo;
//
//import org.apache.ibatis.annotations.Result;
//
//import java.util.Date;
//
///**
// * @author jameszhang
// * @Date 2022/5/21
// */
//
//public class Role {
//    private int id;
//    private String name;
//    private String remark;
//    private Date updateTime;
//    private Date createTime;
//
//    public Role() {
//    }
//
//    public Role(int id, String name, String remark, Date updateTime, Date createTime) {
//        this.id = id;
//        this.name = name;
//        this.remark = remark;
//        this.updateTime = updateTime;
//        this.createTime = createTime;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Role{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", remark='" + remark + '\'' +
//                ", updateTime=" + updateTime +
//                ", createTime=" + createTime +
//                '}';
//    }
//}
