package ex1;

public record Carti(String titlul, String autorul, int anul) {
    public int intCompare(int an1, int an2)
    {
        if (an1 < an2)
        {
            return -1;
        }
        else if(an1 > an2)
        {
            return 1;
        }
        else
            return 0;
    }
}
