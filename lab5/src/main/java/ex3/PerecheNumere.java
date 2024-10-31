package ex3;
//0, 1, 1, 2, 3, 5, 8, 13, 21
public class PerecheNumere {

    private int first;
    private int second;
    public PerecheNumere(){}

    public PerecheNumere(int first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean getFib(){

        if(isFibonacci(first) && isFibonacci(second))
        {
            if(first >= second)
            {
                if((first - second) <= second)
                {
                    return true;
                }
                else
                    return false;
            }
            else {
                if ((second - first) <= first) {
                    return true;
                } else
                    return false;
            }
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
    private boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    private boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }

}
