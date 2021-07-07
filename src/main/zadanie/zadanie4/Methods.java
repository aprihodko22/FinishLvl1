package zadanie.zadanie4;

public class Methods {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.method3(true,3,7,16,199);

    }

   // 1. Напишите метод, который бы проверял, делится ли число xxx(int) на n (int) без остатка и, если не делится,
//     выводила бы остаток на экран. Метод должен принимать два параметра,  выводить надпись на экран "Число xxx делится на n без остатка".
//     "Число xxx не делится на n без остатка. Остаток: y" и,
//    в зависимости от результата, true\false. Вызывающий метод должен выводить на консоль результат true\false

    public void method1 (int n, int b){
        if(n%b==0){
            System.out.println("Число " +n + " делится на " + b + " без остатка");;
            System.out.println(true);
        }else {

            System.out.println("Число " +n+ " не делится на " + b + " без остатка. Остаток: " + n%b);
            System.out.println(false);
        }
    }

//     2. Написать методы, которые будет возводить число в квадрат и продемонстрировать результат их работы.
//      Методы должны принимать как параметр(число) типа String,
//      так и параметр типа int и иметь одинаковое имя. (см. перегрузка методов)
        public void method2 (int n){
            int d = n*n;
            System.out.println(d);
        }
        public void method2 (String string){
            int d = Integer.parseInt(string);
            d = d*d;
            System.out.println(d);
        }


//     3. Объявить метод, который будет принимать boolean параметр и  неопределенное количество параметров типа int.
//    Значения должны быть отсортированы по убыванию\возрастанию (в зависимости от значения параметра типа boolean,
//    который определяет тип сортировки).
//    Написать свою реализацию сортировки, не прибегая к Collections.sort\Arrays.sort и т.п.
//    Метод должен выводить в консоль минимальное и максимальное значение передаваемых параметров с соответствующим сообщением.
//    Предусмотреть следующие случаи поведения программы:
//            1. Количество неопределенных аргументов равно 0
//            2. Количество неопределенных аргументов равно 1

    public void method3 (boolean bool, int...n){
        if(bool == true) {
            for (int i = 0; i < n.length; i++) {
                int min = n[i];
                int min_i = i;
                for (int j = i + 1; j < n.length; j++) {
                    if (n[j] < min) {
                        min = n[j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int tmp = n[i];
                    n[i] = n[min_i];
                    n[min_i] = tmp;
                }
                System.out.println(min);
            }
        } else {
            for (int i = 0; i < n.length; i++) {
                int min = n[i];
                int min_i = i;
                for (int j = i + 1; j < n.length; j++) {
                    if (n[j] > min) {
                        min = n[j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int tmp = n[i];
                    n[i] = n[min_i];
                    n[min_i] = tmp;
                }
                System.out.println(min);
            }
        }
        int max =n[0];
        for (int i = 0; i<n.length; i++) max = Math.max(max, n[i]);
        System.out.println("Максимальное число: "+max);
        int min = n[0];
        for (int i =0; i<n.length; i++) min = Math.min(min, n[i]);
        System.out.println("Минимальное число: "+min);
    }



}
