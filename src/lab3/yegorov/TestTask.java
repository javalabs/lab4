package lab3.yegorov;

/**
 * Created by AdminPC on 02.03.14.
 */

class TestTask extends Task {
    final private double EPS = 0.000001;
    private double myAnswer;
    public TestTask(double m, int n, double myAnswer) {
        super(m, n);
        this.myAnswer = myAnswer;
    }
    public void testMethod() {
        double testAnswer = answer();
        if(Math.abs(testAnswer - myAnswer) < EPS)
            System.out.println("true! " + testAnswer + " (programm answer) = " + myAnswer + " (my answer)");
        else
            System.out.println("false! " + testAnswer + " (programm answer) != " + myAnswer + " (my answer)");
    }
}