package utils;

public class RunStat {
    private long generationTime;
    private long compileTime;
    private long runningTime;
    private long totalTime;
    private int numOfMutatedTests = -1;
    private int numOfSuccessCompile = -1;
    private int numOfFailedRunning = -1;
    private int bucketNum = -1;
    private String className;
    private String type;
    private String testId;

    public RunStat(String name) {
        this.className = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public long getGenerateTime() {
        return generationTime;
    }

    public void setGenerateTime(long generationTime) {
        this.generationTime = generationTime;
    }

    public long getCompileTime() {
        return compileTime;
    }

    public void setCompileTime(long compileTime) {
        this.compileTime = compileTime;
    }

    public long getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(long runningTime) {
        this.runningTime = runningTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public int getNumOfMutatedTests() {
        return numOfMutatedTests;
    }

    public void setNumOfMutatedTests(int numOfMutatedTests) {
        this.numOfMutatedTests = numOfMutatedTests;
    }

    public int getNumOfSuccessCompile() {
        return numOfSuccessCompile;
    }

    public void setNumOfSuccessCompile(int numOfSuccessCompile) {
        this.numOfSuccessCompile = numOfSuccessCompile;
    }

    public int getNumOfFailedRunning() {
        return numOfFailedRunning;
    }

    public void setNumOfFailedRunning(int numOfFailedRunning) {
        this.numOfFailedRunning = numOfFailedRunning;
    }

    public int getBucketNum() {
        return bucketNum;
    }

    public void setBucketNum(int bucketNum) {
        this.bucketNum = bucketNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        String head = String.format("Type,Test ID,Class Name,# of Mutated Testcases,# of Success Compile Testcases,# of Failed Running Testcases,# of Buckets, Generation Time,Compile Time, Running Time,Total Time");
        String stat = String.format("%s,%s,%s,%d,%d,%d,%d,%d,%d,%d,%d", type, testId, className, numOfMutatedTests, numOfSuccessCompile, numOfFailedRunning, bucketNum,
                generationTime, compileTime, runningTime, totalTime);
        return head + "\n" + stat;
    }

    public String getHead() {
        String head = String.format("Type,Test ID,Class Name,# of Mutated Testcases,# of Success Compile Testcases,# of Failed Running Testcases,# of Buckets, Generation Time,Compile Time, Running Time,Total Time");

        return head;
    }

    public String getStat() {
        String stat = String.format("%s,%s,%s,%d,%d,%d,%d,%d,%d,%d,%d", type, testId, className, numOfMutatedTests, numOfSuccessCompile, numOfFailedRunning, bucketNum,
                generationTime, compileTime, runningTime, totalTime);

        return stat;
    }
}
