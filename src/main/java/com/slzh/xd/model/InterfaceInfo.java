package com.slzh.xd.model;

import java.util.Date;

public class InterfaceInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.interface_info_id
     *
     * @mbggenerated
     */
    private Long interfaceInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.register_info_id
     *
     * @mbggenerated
     */
    private Long registerInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.developers
     *
     * @mbggenerated
     */
    private String developers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.application_name
     *
     * @mbggenerated
     */
    private String applicationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.interface_type
     *
     * @mbggenerated
     */
    private String interfaceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.interface_addresses
     *
     * @mbggenerated
     */
    private String interfaceAddresses;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.request_mode
     *
     * @mbggenerated
     */
    private String requestMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.is_enabled
     *
     * @mbggenerated
     */
    private Boolean isEnabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.is_delete
     *
     * @mbggenerated
     */
    private Boolean isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.create_department
     *
     * @mbggenerated
     */
    private String createDepartment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.create_server_host
     *
     * @mbggenerated
     */
    private String createServerHost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.update_department
     *
     * @mbggenerated
     */
    private String updateDepartment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.update_server_host
     *
     * @mbggenerated
     */
    private String updateServerHost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_interface_info.record_version
     *
     * @mbggenerated
     */
    private Integer recordVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.interface_info_id
     *
     * @return the value of t_interface_info.interface_info_id
     *
     * @mbggenerated
     */
    public Long getInterfaceInfoId() {
        return interfaceInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.interface_info_id
     *
     * @param interfaceInfoId the value for t_interface_info.interface_info_id
     *
     * @mbggenerated
     */
    public void setInterfaceInfoId(Long interfaceInfoId) {
        this.interfaceInfoId = interfaceInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.register_info_id
     *
     * @return the value of t_interface_info.register_info_id
     *
     * @mbggenerated
     */
    public Long getRegisterInfoId() {
        return registerInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.register_info_id
     *
     * @param registerInfoId the value for t_interface_info.register_info_id
     *
     * @mbggenerated
     */
    public void setRegisterInfoId(Long registerInfoId) {
        this.registerInfoId = registerInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.developers
     *
     * @return the value of t_interface_info.developers
     *
     * @mbggenerated
     */
    public String getDevelopers() {
        return developers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.developers
     *
     * @param developers the value for t_interface_info.developers
     *
     * @mbggenerated
     */
    public void setDevelopers(String developers) {
        this.developers = developers == null ? null : developers.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.application_name
     *
     * @return the value of t_interface_info.application_name
     *
     * @mbggenerated
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.application_name
     *
     * @param applicationName the value for t_interface_info.application_name
     *
     * @mbggenerated
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.interface_type
     *
     * @return the value of t_interface_info.interface_type
     *
     * @mbggenerated
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.interface_type
     *
     * @param interfaceType the value for t_interface_info.interface_type
     *
     * @mbggenerated
     */
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.interface_addresses
     *
     * @return the value of t_interface_info.interface_addresses
     *
     * @mbggenerated
     */
    public String getInterfaceAddresses() {
        return interfaceAddresses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.interface_addresses
     *
     * @param interfaceAddresses the value for t_interface_info.interface_addresses
     *
     * @mbggenerated
     */
    public void setInterfaceAddresses(String interfaceAddresses) {
        this.interfaceAddresses = interfaceAddresses == null ? null : interfaceAddresses.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.request_mode
     *
     * @return the value of t_interface_info.request_mode
     *
     * @mbggenerated
     */
    public String getRequestMode() {
        return requestMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.request_mode
     *
     * @param requestMode the value for t_interface_info.request_mode
     *
     * @mbggenerated
     */
    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode == null ? null : requestMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.is_enabled
     *
     * @return the value of t_interface_info.is_enabled
     *
     * @mbggenerated
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.is_enabled
     *
     * @param isEnabled the value for t_interface_info.is_enabled
     *
     * @mbggenerated
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.remark
     *
     * @return the value of t_interface_info.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.remark
     *
     * @param remark the value for t_interface_info.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.is_delete
     *
     * @return the value of t_interface_info.is_delete
     *
     * @mbggenerated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.is_delete
     *
     * @param isDelete the value for t_interface_info.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.create_user
     *
     * @return the value of t_interface_info.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.create_user
     *
     * @param createUser the value for t_interface_info.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.create_department
     *
     * @return the value of t_interface_info.create_department
     *
     * @mbggenerated
     */
    public String getCreateDepartment() {
        return createDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.create_department
     *
     * @param createDepartment the value for t_interface_info.create_department
     *
     * @mbggenerated
     */
    public void setCreateDepartment(String createDepartment) {
        this.createDepartment = createDepartment == null ? null : createDepartment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.create_server_host
     *
     * @return the value of t_interface_info.create_server_host
     *
     * @mbggenerated
     */
    public String getCreateServerHost() {
        return createServerHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.create_server_host
     *
     * @param createServerHost the value for t_interface_info.create_server_host
     *
     * @mbggenerated
     */
    public void setCreateServerHost(String createServerHost) {
        this.createServerHost = createServerHost == null ? null : createServerHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.create_time
     *
     * @return the value of t_interface_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.create_time
     *
     * @param createTime the value for t_interface_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.update_user
     *
     * @return the value of t_interface_info.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.update_user
     *
     * @param updateUser the value for t_interface_info.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.update_department
     *
     * @return the value of t_interface_info.update_department
     *
     * @mbggenerated
     */
    public String getUpdateDepartment() {
        return updateDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.update_department
     *
     * @param updateDepartment the value for t_interface_info.update_department
     *
     * @mbggenerated
     */
    public void setUpdateDepartment(String updateDepartment) {
        this.updateDepartment = updateDepartment == null ? null : updateDepartment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.update_server_host
     *
     * @return the value of t_interface_info.update_server_host
     *
     * @mbggenerated
     */
    public String getUpdateServerHost() {
        return updateServerHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.update_server_host
     *
     * @param updateServerHost the value for t_interface_info.update_server_host
     *
     * @mbggenerated
     */
    public void setUpdateServerHost(String updateServerHost) {
        this.updateServerHost = updateServerHost == null ? null : updateServerHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.update_time
     *
     * @return the value of t_interface_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.update_time
     *
     * @param updateTime the value for t_interface_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_interface_info.record_version
     *
     * @return the value of t_interface_info.record_version
     *
     * @mbggenerated
     */
    public Integer getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_interface_info.record_version
     *
     * @param recordVersion the value for t_interface_info.record_version
     *
     * @mbggenerated
     */
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }
}