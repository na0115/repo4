package com.nxl_ssm.vo;

public class PermissionIdVo {
    private String permissionId;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "PermissionIdVo{" +
                "permissionId='" + permissionId + '\'' +
                '}';
    }
}
