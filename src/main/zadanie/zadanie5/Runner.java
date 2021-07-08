package zadanie.zadanie5;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

//        Спроектируйте и реализуйте следующую структуру:
//        Есть студенты, которые учатся в Академии.
//                Каждый студент имеет оценки (1-10).
//                Академия умеет отчислять студентов если средний балл меньше 4.
//        Академия умеет принимать на учебу новых студенов и выводить список студентов в штате (не отчисленных).
            Academy academy = new Academy();
            academy.list();
    }
}
