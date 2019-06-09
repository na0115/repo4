package com.nxl_ssm.vo;

public class UserIdVo {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserIdVo{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
