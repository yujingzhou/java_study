package test.com.classfify;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
    
    public static String classify(Set<?> set){
        return "Set";
    }
    
    public static String classify(List<?> list){
        return "List";
    }
    
    public static String classify(Collection<?> c){
        return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        //由于在编译时决定
        Collection<?>[] collections = new Collection<?>[] {
                new HashSet<String>(),
                new ArrayList<String>(),
                new HashMap<String, String>().values()
        };
        for (Collection<?> collection : collections) {
            System.out.println(classify(collection));
        }
    }

}
