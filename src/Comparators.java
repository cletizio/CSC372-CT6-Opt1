public class Comparators {
    static class NameComparator implements java.util.Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    static class RollNoComparator implements java.util.Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.rollno - s2.rollno;
        }
    }
}
