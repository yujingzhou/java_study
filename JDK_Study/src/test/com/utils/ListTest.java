package test.com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class ListTest {
    
    /**
     * string的list
     */
    private List<String> sList;
    
    private Set<Integer> set;
    
    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<String> getSList() {
        return sList;
    }

    public void setSList(List<String> list) {
        sList = list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.listIterator();
        for (ListIterator<Integer> li = list.listIterator();li.hasNext();) {
            li.next();
            li.add(3);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
