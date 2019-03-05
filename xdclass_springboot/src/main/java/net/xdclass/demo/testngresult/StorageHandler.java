package net.xdclass.demo.testngresult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.stereotype.Component;
import org.testng.ITestContext;
import org.testng.ITestResult;

@Component
public class StorageHandler {
 
    /*@Resource
    private ITestResultService testResultService;
    @Resource
    private Env env;
 
    *//**
     * 获取当前测试环境
     *
     * @return
     *//*
    private String getEnvModel() {
        return Objects.toString(env.getEnvModel(), StringUtils.EMPTY);
    }
 
    *//**
     * 获取ITestContext中的测试结果，将结果插入到数据库
     *
     * @param testContext
     *//*
    public void handle(ITestContext testContext) {
        //所有测试结果
        List<TestResultStoragePO> testResultStoragePOs = new ArrayList();
        String env = getEnvModel();
        String testTaskId = generatorId();
        String testName = testContext.getName();
        testContext.getPassedTests().getAllResults().forEach(iTestResult -> testResultStoragePOs.add
                (assembleTestResult(iTestResult, env, testTaskId, testName)));
        testContext.getSkippedTests().getAllResults().forEach(iTestResult -> testResultStoragePOs.add
                (assembleTestResult(iTestResult, env, testTaskId, testName)));
        testContext.getFailedTests().getAllResults().forEach(iTestResult -> testResultStoragePOs.add
                (assembleTestResult(iTestResult, env, testTaskId, testName)));
        insertData(testResultStoragePOs);
    }
 
    *//**
     * 组装测试用例结果入库对象
     *
     * @param testResult
     * @param env
     * @param testTaskId
     * @param testName
     * @return
     *//*
    private TestResultStoragePO assembleTestResult(ITestResult testResult, String env, String testTaskId, String testName) {
        TestResultStoragePO testResultStoragePO = new TestResultStoragePO();
        testResultStoragePO.setTestClass(testResult.getTestClass().getName());
        testResultStoragePO.setMethod(testResult.getName());
        testResultStoragePO.setStartTime(new Date(testResult.getStartMillis()));
        testResultStoragePO.setEndTime(new Date(testResult.getEndMillis()));
        testResultStoragePO.setStatus(testResult.getStatus());
        testResultStoragePO.setErrMsg(testResult.getThrowable() == null ? "" : testResult.getThrowable().getMessage());
        testResultStoragePO.setEnv(env);
        testResultStoragePO.setTestTaskId(testTaskId);
        testResultStoragePO.setId(generatorId());
        testResultStoragePO.setTestName(testName);
        return testResultStoragePO;
    }
 
    *//**
     * 向数据库中插入测试结果数据
     *
     * @param testResultStoragePOs
     *//*
    private void insertData(List<TestResultStoragePO> testResultStoragePOs) {
        testResultService.insertTestResult(testResultStoragePOs);
    }
 
    *//**
     * 生成唯一ID
     *
     * @return
     *//*
    private String generatorId() {
        String s = UUID.randomUUID().toString();
        return s.replaceAll("-", "");
    }*/
 
 
}
