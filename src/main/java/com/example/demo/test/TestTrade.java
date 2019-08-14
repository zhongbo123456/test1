package com.example.demo.test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class TestTrade {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //找出2011年的所有交易并按交易额排序（从低到高）
        List<Transaction> collect = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        //找出2011年的所有交易并按交易额排序（从高到低）
        List<Transaction> collect1 = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        //交易员都在哪些不同的城市工作过(使用distinct)
        List<String> collect2 = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);
        //交易员都在哪些不同的城市工作过(toSet)
        Set<String> collect3 = transactions.stream().map(transaction -> transaction.getTrader().getCity()).collect(toSet());
        System.out.println("collect3 = " + collect3);
        //查找所有来自于剑桥的交易员，并按姓名排序
        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("cambridge = " + cambridge);
        //返回所有交易员的姓名字符串，按字母顺序排序
        String reduce = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a, b) -> a + b);
        System.out.println("reduce = " + reduce);
        //返回所有交易员的姓名字符串，按字母顺序排序，使用joining（）
        String collect4 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println("collect4 = " + collect4);
        //有没有交易员是在米兰工作的
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("milan = " + milan);
        //打印生活在剑桥的交易员的所有交易额
         transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
         //所有交易中，最高的交易额是多少
        Optional<Integer> reduce1 = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println("reduce1 = " + reduce1);
        //找到交易额最小的交易
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println("min = " + min);


    }
}
