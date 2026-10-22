package T1;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //构造传入比较器匿名内部类
        TreeMap<Student,String> tm2=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //年龄降序；年龄相同姓名降序
                int num = o2.getAge() - o1.getAge();
                if(num==0){
                    num = o2.getName().compareTo(o1.getName());
                }
                return num;
            }
        });

        tm2.put(new Student("潘安", 27),"晋朝");
        tm2.put(new Student("柳下惠", 30),"元朝");
        tm2.put(new Student("唐伯虎", 28),"明朝");
        tm2.put(new Student("赵子龙", 29),"三国");
        tm2.put(new Student("潘安", 27),"宋朝");
        tm2.put(new Student("潘美", 27),"唐朝");

        Set<Student> keys = tm2.keySet();
        for(Student s:keys){
            System.out.println(s.getName()+"\t"+s.getAge()+"\t"+tm2.get(s));
        }
    }

    // 内部类Student，放在TreeMapDemo2里面，同文件，直接识别
    static class Student{
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
    }
}
