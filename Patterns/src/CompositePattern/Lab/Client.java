package CompositePattern.Lab;

public class Client {

    public static void main (String[] args){
        IEU SE = new CompositeElmentDepartments("Software Engineering");
        SE.Add(new PrimitiveElementLessonsCodes("SE 311"));
        SE.Add(new PrimitiveElementLessonsCodes("SE 318"));

        IEU CE = new CompositeElmentDepartments("Computer Engineering");
        CE.Add(new PrimitiveElementLessonsCodes("CE 306"));
        CE.Add(new PrimitiveElementLessonsCodes("CE 302"));

        IEU math = new CompositeElmentDepartments("Mathematics");
        math.Add(new PrimitiveElementLessonsCodes("Math 304"));
        math.Add(new PrimitiveElementLessonsCodes("Math 306"));

        IEU psycholgy = new CompositeElmentDepartments("Mathematics");
        psycholgy.Add(new PrimitiveElementLessonsCodes("PSY 334"));
        psycholgy.Add(new PrimitiveElementLessonsCodes("PSY 332"));


        IEU root = new CompositeElementFaculty("Software Engineering");
        root.Add(SE);
        root.Add(CE);

        IEU root2 = new CompositeElementFaculty("Faculty Arts And Science");
        root2.Add(math);
        root2.Add(psycholgy);

        IEU ieu = new CompositeElementFaculty("IEU");
        ieu.Add(root);
        ieu.Add(root2);

        ieu.Display(0);

    }
}
