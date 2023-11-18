import java.util.ArrayList;

public class StudentSort {
    public static void main(String[] args) {
        // Create an ArrayList to store student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Populate the ArrayList with 10 student objects
        studentList.add(new Student(10001, "Frank", "123 Main St"));
        studentList.add(new Student(10002, "Sally", "456 Oak St"));
        studentList.add(new Student(10003, "Gertrude", "789 Pine St"));
        studentList.add(new Student(10004, "George", "567 Elm St"));
        studentList.add(new Student(10005, "Perry", "890 Birch St"));
        studentList.add(new Student(10060, "Alice", "234 Cedar St"));
        studentList.add(new Student(10070, "Fred", "678 Maple St"));
        studentList.add(new Student(10008, "Rita", "901 Spruce St"));
        studentList.add(new Student(10009, "Homer", "345 Fir St"));
        studentList.add(new Student(10100, "Marge", "678 Willow St"));

        // Display the unsorted list
        System.out.println("Unsorted List:");
        displayList(studentList);

        // Sort the list by name using NameComparator and selectionSort
        selectionSort(studentList, new Comparators.NameComparator());
        System.out.println("\nSorted by Name:");
        displayList(studentList);

        // Sort the list by rollno using RollNoComparator and selectionSort
        selectionSort(studentList, new Comparators.RollNoComparator());
        System.out.println("\nSorted by Roll Number:");
        displayList(studentList);
    }
    // Custom selection sort method
    private static <T> void selectionSort(ArrayList<T> list, java.util.Comparator<T> comparator) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Display the list of students
    private static void displayList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}