public class Test2 {
    public static void main(String[] args) {
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


interface Swiming{
    void swim();
}

