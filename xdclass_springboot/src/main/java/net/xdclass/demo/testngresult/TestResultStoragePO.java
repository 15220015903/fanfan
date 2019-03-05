package net.xdclass.demo.testngresult;

import java.util.Date;

public class TestResultStoragePO {
	private String testClass;
	private String method;
	private Date startTime;
	private Date endTime;
	private int status;
	private String errMsg;
	private String env;
	private String testTaskId;
	private String id;
	private String testName;
	public String getTestClass() {
		return testClass;
	}
	public void setTestClass(String testClass) {
		this.testClass = testClass;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getTestTaskId() {
		return testTaskId;
	}
	public void setTestTaskId(String testTaskId) {
		this.testTaskId = testTaskId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}
