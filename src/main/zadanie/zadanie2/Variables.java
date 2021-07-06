package zadanie.zadanie2;

public class Variables {
    public static void main(String[] args) {

//        Массивы
//        1. Объявить и инициализировать массив типа int размером 3 элемента
//        2. Вывести в консоль все элементы массива
//        3. Поменять местами первый и последний элементы (для обращения к последнему элементу массива не указывать его индекс явно)
//        4. Вывести в консоль все элементы массива
        int [] a;
        a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for(int i =0; i <a.length; i++){
            System.out.println(a[i]);
        }
        int lastelement = a[a.length - 1];
        a[a.length - 1] = a[0];
        a[0] = lastelement;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }






        // 2я часть задания
//        Переменные
//        1. Объявить переменную String stringValue и присвоить ей значение 2
//        2. Объявить переменную double result и присвоить ей результат операции stringValue/3.0 (необходимо преобразовать stringValue в тип double)
//        3. Объявить переменную rounding и в нее записать результат округления переменной result до 4 значащих цифр (в соответствии с правилами округления)
//        4. Вывести в консоль текст "Результат операции: rounding", где rounding - значение, полученное выше.
//        5. Для сложения строк использовать 2 способа из лекции и самостоятельно изучить метод String.format()
//        6. Вывести в консоль булиновский результат сравнения значений rounding и result
        String stringValue = "2";
        double result = Double.parseDouble(stringValue)/3;
        String rounding = String.format("%.4f", result);
        System.out.println(rounding);
        boolean b= rounding.equals(result);
        System.out.println(stringValue + rounding);
        System.out.printf(stringValue.concat(rounding));




    }
}
