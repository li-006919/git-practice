package Test1;

import static Test1.Test.printarr;

public class Test2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1, "zahngsan", 20);
        Student stu2 = new Student(2, "lisi", 21);
        Student stu3 = new Student(3, "wangwu", 22);

        //存入对象
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        int index = getIndex(arr, 4);
        if (index >= 0) {
            arr[index] = null;
            printarr(arr);
        } else {
            System.out.println("该id不存在");
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}
