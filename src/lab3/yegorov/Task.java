package lab3.yegorov;

/**
 * Created by AdminPC on 02.03.14.
 */

class Task {
    private double m;   // граммы
    private int n;      // n-й день рождения
    private double firstDay;
    private double secondDay;
    private double newDay;
    public Task(double m, int n) {
        this.m = m;
        this.n = n;
        firstDay = secondDay = m;
    }
    private double fibonacci(int n) {
        if(n <= 2) return m;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
    private double cycleSolve() {
        for(int i = 2; i < this.n; ++i) {
            newDay = firstDay + secondDay;
            firstDay = secondDay;
            secondDay = newDay;
        }
        return newDay;
    }
    public double answer() {
        return cycleSolve();
        //return fibonacci(n);
    }
}