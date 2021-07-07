package zadanie.zadanie5;

public class Students {
    String name;
    int[]n;
    public Students(){

    }

    public Students(String name, int...n) {
        this.name= name;
        this.n = n;
        int max =n[0];
        for (int i = 0; i<n.length; i++) max = Math.max(max, n[i]);
        int min = n[0];
        for (int i =0; i<n.length; i++) min = Math.min(min, n[i]);
        if(min<1 && max >10){
            System.out.println("Была допущена ошибка у: Оценки должны быть от 4 до 10 NEW");
        }else {
         //   System.out.println("Была допущена ошибка. Оценки должны быть от 4 до 10");
        }
    }

    double result;
    public double avrRat(int...n){
        for(double d: n){
            result +=d;
        }
        double avr = result/n.length;
        return avr;
    }
}
