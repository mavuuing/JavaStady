
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get set方法
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
class student1{
    //姓名 年龄 身高 性别
    private String name;
    private int age;
    private int height;
    private String sex;

    // 手动添加的构造函数
//    public student(String name, int age, int height, String sex) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.sex = sex;
//    }
//}



}