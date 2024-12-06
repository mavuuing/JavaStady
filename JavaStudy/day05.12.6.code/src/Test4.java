import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
      Student[] students=new Student[10];
      students[0]=new Student("张三",18,180,"男");
      students[1]=new Student("李四",19,190,"男");
      students[2]=new Student("王五",20,170,"女");
      students[3]=new Student("赵六",21,180,"女");
      students[4]=new Student("孙七",22,170,"男");
      students[5]=new Student("刘亦菲",23,160,"女");
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}


