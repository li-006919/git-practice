package Test1;

public class Test {
    public static void main(String[] args) {
        //创建数组
        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1, "zahngsan", 20);
        Student stu2 = new Student(2, "lisi", 21);

        //存入对象
        arr[0] = stu1;
        arr[1] = stu2;

        //添加对象
        Student stu4 = new Student(3, "mazi", 24);
        int count = Count(arr);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前id相同，请修改后尝试");
        } else if (count == arr.length) {
            Student[] newarr = creat(arr);
            printarr(newarr);
            newarr[count] = stu4;
        } else {
            arr[count] = stu4;
            printarr(arr);
        }


    }

    //判断id是否相同
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu!= null && stu.getId() == id) {
                return true;
            }
        }
        return false;
    }

    //起算数组内对象个数
    public static int Count(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建新数组
    public static Student[] creat(Student[] arr) {
        Student[] newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    //展示数据
    public static void printarr(Student[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("编号：" + stu.getId() + " " + "年龄：" + stu.getAge() + " " + "姓名：" + stu.getName());
            }
        }
    }
}