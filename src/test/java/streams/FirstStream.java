package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {
    public static void main(String[] args) {
        List<Product> l1 = GetProductsList.getList();
        System.out.println(l1);
        l1.stream().filter(p-> p.getPrice()> 30000).forEach(prod-> System.out.println(prod));
        System.out.println("test");
        l1.stream().filter(p-> p.getPrice()> 30000).map(m-> m.getPrice()+5000).forEach(f-> System.out.println(f));
        System.out.println("--------------new list");
        List<Product> n = l1.stream().filter(p-> p.getPrice()> 30000).collect(Collectors.toList());
        System.out.println(n);
        System.out.println("==================");

        List<Double> n1=  n.stream().map(p-> p.getPrice()).collect(Collectors.toList());
        System.out.println(n1);


        List<Integer> l2 = Arrays.asList(3,5,23,232,6,7889,54);

        int no = l2.stream().max((o1, o2) -> o1>o2 ? 1: -1).get();
        System.out.println(no);
        System.out.println(l2.indexOf(7889));
    }
}
