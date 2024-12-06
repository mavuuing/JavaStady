public class Test1 {

    public static void main(String[] args) {
// 新的写法：
// 使用匿名内部类的方式，创建了一个匿名的子类对象
         Swim s1=new Swim() {
             @Override
             public void swim() {
                 System.out.println("学生在游泳很快");
             }

         };
        start(s1);
        System.out.println("=========================");


        start(new Swim() {
            @Override
            public void swim() {
                System.out.println("老师在游泳很快");
            }
        });
         }



    public static void start(Swim s) {
        System.out.println("开始游泳");
        s.swim();
        System.out.println("ending");
    }

}


interface Swim{
void swim();
}

//旧的写法：多态形式
//class teacher implements Swim{
//    @Override
//    public void swim(){
//        System.out.println("老师在游泳");
//    }
//
//}
//class student implements Swim{
//    @Override
//    public void swim(){
//        System.out.println("学生在游泳");
//    }
//}