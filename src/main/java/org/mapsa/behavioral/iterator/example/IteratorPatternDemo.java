package org.mapsa.behavioral.iterator.example;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
       for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
           String name=(String) iterator.next();
           System.out.println("Name : "+    name);
       }
    }
}
