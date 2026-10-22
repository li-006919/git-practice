package SMSTest;

import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("------学生管理系统-------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出系统");
            System.out.println("-----------------------");
            System.out.println("请输入您的选择：");
            menu(list);
        }
    }

    public static void menu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addStudent(list);
                break;
            case 2:
                deleteStudent(list);
                break;
            case 3:
                updateStudent(list);
                break;
            case 4:
                queryStudent(list);
                break;
            case 5:
                System.out.println("退出");
                System.exit(0);
                break;
            default:
                System.out.println("该选项不存在");
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生：");
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        while (true) {
            System.out.println("请输入ID：");
            String ID=sc.next();
            boolean flag=contains(list,ID);
            if (flag) {
                System.out.println("ID重复");
            } else {
                stu.setId(ID);
                break;
            }
        }
        System.out.println("请输入姓名：");
        stu.setName(sc.next());
        System.out.println("请输入年龄：");
        stu.setAge(sc.nextInt());
        System.out.println("请输入地址：");
        stu.setAdress(sc.next());
        list.add(stu);
        System.out.println("生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if(list.size()==0){
                System.out.println("当前系统中无学生信息");
                break;
            }
            System.out.println("请输入要删除的ID:");
            String ID = sc.next();
            int index = getindex(list, ID);
            if (index < 0) {
                System.out.println("该ID"+ID+"不存在");
            } else {
                list.remove(index);
                System.out.println("该学生已删除");
                break;
            }
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if(list.size()==0){
                System.out.println("当前系统中无学生信息");
                break;
            }
            System.out.println("请输入要修改的ID:");
            String ID = sc.next();
            int index = getindex(list, ID);
            if (index >= 0) {
                Student s = list.get(index);
                System.out.println("请输入要修改的姓名:");
                s.setName(sc.next());
                System.out.println("请输入要修改的年龄:");
                s.setAge(sc.nextInt());
                System.out.println("请输入要修改的地址:");
                s.setAdress(sc.next());
                System.out.println("修改完成");
                break;
            } else {
                System.out.println("该ID"+ID+"不存在");
            }
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生：");
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");

        } else {
            System.out.printf("%-10s%-10s%-10s%-20s%n", "ID", "姓名", "年龄", "地址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = new Student();
                stu = list.get(i);
                System.out.printf("%-10s%-10s%-10s%-20s%n",
                        stu.getId(), stu.getName(), stu.getAge(), stu.getAdress());
            }

        }
    }

    public static int getindex(ArrayList<Student> list, String ID) {
        for (int i = 0; i < list.size(); i++) {
            Student s = new Student();
            s = list.get(i);
            if (s.getId().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(ArrayList<Student> list, String ID) {
        for (int i = 0; i < list.size(); i++) {
            Student s = new Student();
            s = list.get(i);
            if (s.getId().equals(ID)) {
                return true;
            }
        }
        return false;
    }
}
