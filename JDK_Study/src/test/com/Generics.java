package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型测试
 * @author 
 *     bo.yu
 * @email
 *     bo.yu@renren-inc.com
 * @time
 *     2012-11-21 下午08:00:35
 * @param <E>
 */
public class Generics{

    public <E> List<E> union(List<? extends E> l1, List<? extends E> l2){
        List<E> list = new ArrayList<E>();
        list.addAll(l1);
        list.addAll(l2);
        return list;
    }

    public <E extends Comparable <? super E>> E max(List<? extends E> list){
        Iterator<? extends E> iterator = list.iterator();
        E result = iterator.next();
        while(iterator.hasNext()){
            E e = iterator.next();
            if(e.compareTo(result) > 0 )
                result =e;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Generics generics = new Generics();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(25);
        integers.add(89);
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(25.6);
        List<Number> numbers = generics.<Number>union(integers, doubles);
        for (Number number : numbers) {
            System.out.println(number);
        }
        Number max = generics.max(integers);
        System.out.println(max);
    }
}
