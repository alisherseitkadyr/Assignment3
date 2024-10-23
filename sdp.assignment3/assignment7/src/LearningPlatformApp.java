public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();
        course.addLecture(new ProxyVideoLecture("Design Patterns Introduction"));
        course.addLecture(new ProxyVideoLecture("Proxy Pattern"));
        course.addLecture(new ProxyVideoLecture("Decorator Pattern"));

        System.out.println("Course Lecture Info:");
        course.showLecturesInfo();

        System.out.println("\nStudent starts watching the first lecture:");
        course.playLecture(0);

        System.out.println("\nStudent starts watching the second lecture:");
        course.playLecture(1);
    }
}
