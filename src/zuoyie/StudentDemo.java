package zuoyie;
import T1.TreeMapDemo1;
import java.util.ArrayList;
import java.util.List;
class Student1 {
        //成员变量
        private String name;
        private int age;

        public Student1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student1() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

    public void setAge(int age) {
        this.age = age;
    }
}
public class StudentDemo {
    public static void main(String[] args) {

        List<TreeMapDemo1.Student> list = new ArrayList<>();
        list.add(new TreeMapDemo1.Student("王伦",21));
        list.add(new TreeMapDemo1.Student("王苑",18));
        list.add(new TreeMapDemo1.Student("程宇",20));
        list.add(new TreeMapDemo1.Student("毕胜",22));
        list.add(new TreeMapDemo1.Student("张雪",19));

        // 增强for循环遍历，按添加顺序输出
        for(TreeMapDemo1.Student stu : list){
            System.out.println(stu.getName() + "\t" + stu.getAge());
        }
    }
}
