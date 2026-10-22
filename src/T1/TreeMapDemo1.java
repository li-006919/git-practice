package T1;

import java.util.TreeMap;
import java.util.Set;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm1=new TreeMap<>();
        tm1.put(new Student("潘安", 27),"晋朝");
        tm1.put(new Student("柳下惠", 30),"元朝");
        tm1.put(new Student("唐伯虎", 28),"明朝");
        tm1.put(new Student("赵子龙", 29),"三国");
        tm1.put(new Student("潘安", 27),"宋朝");//重复key覆盖
        tm1.put(new Student("潘美", 27),"唐朝");

        Set<Student> keys = tm1.keySet();
        for(Student s:keys){
            System.out.println(s.getName()+"\t"+s.getAge()+"\t"+tm1.get(s));
        }
    }

    public static class Student implements Comparable<Student>{
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " " + age;
        }

        //排序规则：年龄从高到低；年龄相同，姓名从高到低
        @Override
        public int compareTo(Student s) {
            //先比较年龄，降序
            int num = s.age - this.age;
            if(num==0){
                //年龄相等，姓名降序
                num = s.name.compareTo(this.name);
            }
            return num;
        }
    }
}
