package Listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



    public class Retry implements IRetryAnalyzer{
        int MaxAttempt=3;
        int retry=0;
        public boolean retry(ITestResult iTestResult){
            if(retry<MaxAttempt){
                retry++;
                return true;
            }
            return false;
        }
    }

