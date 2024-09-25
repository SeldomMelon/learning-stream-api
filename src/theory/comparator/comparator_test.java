package theory.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class comparator_test {
    public static void main(String[] args) {
        //Comparator - функция сравнения, которая принимает два аргумента и возвращает:
        //-Отрицательное число - если первый объект меньше второго
        //-0 - если объекты равны
        //-Положительное число - если первый объект больше второго
        //пример: Шеренга на физкультуре (самые высокие в начале, самые низкие в конце)'

       Student ivan = new Student(190);
       Student petr = new Student(170);


       Student[] students = new Student[]{ivan, petr};
       System.out.println(Arrays.toString(students));

       System.out.println(compare(ivan, petr)); //Вынесено в отдельный метод

       //принцип работы компаратора через лямбду
       Comparator<Student> studentComparator = (st1, st2) -> st1.getHeight() - st2.getHeight();
       sortStudent(students, studentComparator);
       System.out.println(Arrays.toString(students));

    }

    //принцип работы компаратора
    public static int compare(Student st1, Student st2){
        return st1.getHeight() - st2.getHeight();
    }

    //В сигнатуре метода я передал Сам массив студентов и принцип (компаратор) по которому они будут сравниваться
    public static void sortStudent(Student[] students, Comparator<Student>comparator){
        int result = comparator.compare(students[0], students[1]);
        if (result > 0 ){
            Student temp = students[0];
            students[0] = students[1];
            students[1] = temp;
        }

    }

}
