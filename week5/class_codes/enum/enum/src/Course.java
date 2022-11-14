public enum Course {
    MATH(102 , "John Nash"),
    CS(103 , "Alan Kay"),
    CHEMISTRY(104, "Aziz Sancar"),
    PHYSICS(105 , "Newton");

   private int courseId;
   private String lecurer;
    Course(int courseID , String lecurer){
        this.courseId = courseID;
        this.lecurer = lecurer;
    }

    int getCourseId(){
        return courseId;
    }
        String getLecurer(){
        return lecurer;
    }

}
