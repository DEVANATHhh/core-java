public interface OnlineLearningPlatform {
    int COURSE_LIMIT = 50, STUDENT_LIMIT = 1000, VERSION = 9;

    void enrollCourse();
    void completeCourse();

    default void quiz() {
        System.out.println("Quiz started");
    }

    default void certificate() {
        System.out.println("Certificate generated");
    }

    static void info() {
        System.out.println("Online Learning Interface");
    }
}
