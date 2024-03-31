 // this is a program to know more about the enum keyword and its functionlity in java
 enum Result
 {
    PASS,FAIL,NR;

    int marks;

    Result()
    {
        System.out.println("Constructor in enum.");
    }
    void setMarks(int marks)
    {
        this.marks = marks;
    }

    int getMarks()
    {
        return marks;
    }
 }

 public class A7
 {
    public static void main(String args[])
    {
        Result.PASS.setMarks(50);
        int m1 = Result.PASS.getMarks();

        System.out.println(m1);
    }
 }