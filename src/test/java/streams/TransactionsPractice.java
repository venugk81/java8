package streams;

import datasupplier.GetData;
import datasupplier.Transaction;
import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransactionsPractice {

    @Test
    public void test(){
//        https://www.javaprogramto.com/2021/06/java-8-stream-group-by-count.html
//        https://www.baeldung.com/java-groupingby-collector
//        https://www.youtube.com/watch?v=PMhrMDHFFW4
//        https://howtodoinjava.com/java8/stream-max-min-examples/#5-find-min-or-max-object-by-field-value
        //get transactions by city
        List<Transaction> transactions =  GetData.getTransactions();
        List<Transaction> hydTrasactions = transactions.stream().filter(city -> city.getTrader().getCity().equals("hyd")).collect(Collectors.toList());
        hydTrasactions.forEach(System.out::println);

        System.out.println("========min value=============");
        Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue);
        Optional<Transaction> optional=  transactions.stream().min(comparator);
        optional.ifPresent(opt -> System.out.println("min value" + opt));

        System.out.println("=========max value============");
        optional=  transactions.stream().max(comparator);
        optional.ifPresent(opt -> System.out.println("max value" + opt));
        System.out.println("=====================");

        System.out.println("=========grouping by city============");

        Map<String, List<Transaction> > transMap = transactions.stream().collect(Collectors.groupingBy(city-> city.getTrader().getCity()));
        transMap.entrySet().stream().forEach(System.out::println);

        System.out.println("get trader names from hyderabad city");
        List<String> hydTraderNames = transactions.stream()
                .filter(city->city.getTrader().getCity().equalsIgnoreCase("hyd"))
                .map(names-> names.getTrader().getName())
                .collect(Collectors.toList());
        System.out.println(hydTraderNames);

        System.out.println("========sorted map- sorted by city==========");
        transMap = transactions.stream().collect(Collectors.groupingBy(city-> city.getTrader().getCity(), TreeMap::new, Collectors.toList()));
        transMap.entrySet().stream().forEach(System.out::println);

        System.out.println("========grouping by and then counting==========");
//        Map<String, Integer> groupByAndCount =

         List<String> cityNames = transactions.stream().map(cityName->cityName.getTrader().getCity()).collect(Collectors.toList());
         Map<String, Long> countMap = cityNames.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(countMap);

        System.out.println("printing duplicates: ");
        countMap.entrySet().stream().filter(cnt-> cnt.getValue()>1).forEach(System.out::println);



    }
}
