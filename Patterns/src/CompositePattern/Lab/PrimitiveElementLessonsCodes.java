package CompositePattern.Lab;

public  class PrimitiveElementLessonsCodes implements IEU{
    private String lessonCode ;

    public PrimitiveElementLessonsCodes(String lessonCode) {
        this.lessonCode= lessonCode;
    }

    @Override
    public void Add(IEU element) {
        System.out.println("Cannot added because it's primitive and leaf");
    }

    @Override
    public void Remove(IEU element) {
        System.out.println("Cannot remove");
    }

    @Override
    public void Display(int indent) {
        for(int i = 0 ; i <= indent ; i++){
            System.out.print("-");
            System.out.println(" " + lessonCode);
        }
    }

    @Override
    public String getName() {
        return lessonCode;
    }

}
