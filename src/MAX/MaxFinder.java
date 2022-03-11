package MAX;

public class MaxFinder {
    int a,b,c,d ;

    public MaxFinder(int a , int b , int c , int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public int getMax(){
        if(a>b){
            return a ;
        }
        else {
            return b;
        }
    }
    public int getMax(int a, int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public int getMax(int a,int b, int c, int d){
        if(a>b && a>c && a>d){
            return a;
        }
        else if(b>a && b>c && b>d){
            return b;
        }
        else if(c>a && c>b && c>d){
            return c;
        }
        else {
            return d;
        }
    }
}

