package test.com;

@AnnotationTest("test main")
public class TestAnnotation {

    public static void main(String[] args) {
        try {
            TestAnnotation t = (TestAnnotation) Class.forName("test.com.TestAnnotation").newInstance();
            AnnotationTest annotation = t.getClass().getAnnotation(test.com.AnnotationTest.class);
            System.out.println(annotation.value());
            t.saying();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    private void saying(){
        System.out.println("maybe success");
    }

}
