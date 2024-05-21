import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQUEUE {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Tapas", 1));
        pq.add(new Student("Sanjay", 85));
        pq.add(new Student("Jacky", 20));
        pq.add(new Student("Shubham", 11));
        pq.add(new Student("Nitya", 35));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}



// public class PriorityQUEUE {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3);
//         pq.add(1);
//         pq.add(4);
//         pq.add(2);
//         pq.add(5);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }


// public class PriorityQUEUE {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(3);
//         pq.add(1);
//         pq.add(4);
//         pq.add(2);
//         pq.add(5);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }