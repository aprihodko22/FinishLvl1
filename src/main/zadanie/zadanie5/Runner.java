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

        Students ant = new Students("Ant",3,4,1,10,4,5);
        Students adr = new Students("Ant1",3,4,3,4,2,3,4,4,5);
        Students ann = new Students("Ant2",3,4,6,10,4,5);
        Students alk = new Students("Ant3",3,4,5,10,4,5);
        Students arm = new Students("Ant4",3,4,65,10,4,5,78);
        Students atr = new Students("Ant6",3,4,5,10,4,5,7,8);
        ArrayList<Students> students = new ArrayList<Students>();
        students.addAll(Arrays.asList(ant,adr,ann,alk,arm,atr));
            if(ant.avrRat(ant.n)<4){
                students.remove(ant);
            }
            if(adr.avrRat(adr.n)<4){
                students.remove(adr);
            }
            if(ann.avrRat(ann.n)<4){
            students.remove(ann);
            }
            if(alk.avrRat(alk.n)<4){
            students.remove(alk);
            }
            if(arm.avrRat(arm.n)<4){
            students.remove(arm);
            }
            if(atr.avrRat(atr.n)<4){
            students.remove(atr);
            }
            System.out.println("Cтудентов сейчас обучается" +students.size());
            System.out.println(students);
    }
}
