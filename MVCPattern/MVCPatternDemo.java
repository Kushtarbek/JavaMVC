package MVCPattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
    Course model = retrieveCourseFromDatabase();

    //create a view : to write course details on console
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();

        //update model data
        controller.setCourseName("Python");
        System.out.println("** After updating, Course Details are as follows ");
        controller.updateView();
    }

    private static Course retrieveCourseFromDatabase(){
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
