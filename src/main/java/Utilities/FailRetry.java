package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRetry implements IRetryAnalyzer {

    int count = 0;
    int maxTry = 3; // Maximum retry count

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxTry) {
            count++;
            return true;
        }
        return false;
    }
}

// Ravi's code
/*public class FailRetry implements IRetryAnalyzer {

    int maxCount = 3;

    int startCount = 0;



    @Override
    public boolean retry(ITestResult iTestResult) {
        while (maxCount > startCount) {
            if (iTestResult.isSuccess()) {
                return true;
            }
            startCount++;
        }
        return false;
    }

    public FailRetry abc() {
        System.out.println("ABC");
        return new FailRetry();
    }
}*/
