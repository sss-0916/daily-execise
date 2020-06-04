import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static class Student {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        @Override
        public String toString() {
            return this.name + " " + this.score;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            int nums = in.nextInt();
            int asc = in.nextInt();
            Student[] students = new Student[nums];
            for (int i = 0; i < nums; ++i) {
                students[i] = new Student(in.next(), in.nextInt());
            }

            if (asc == 1) {
                Arrays.sort(students, new Comparator<Student>(){
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            } else {
                Arrays.sort(students, new Comparator<Student>(){
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            }

            for (int i = 0; i < nums; ++i) {
                System.out.println(students[i]);
            }
        }
        
        in.close();
    }
}