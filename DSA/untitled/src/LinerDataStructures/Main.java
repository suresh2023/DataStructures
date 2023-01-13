package LinerDataStructures;

public class Main {
    public static void main(String [] args){
        Arrays numbers = new Arrays(3);
        numbers.insert(100);
        numbers.insert(2);
        numbers.insert(13);

        Arrays num2 = new Arrays(5);
        num2.insert(1);
        num2.insert(2);
        num2.insert(100);

        Arrays.intersect(numbers, num2);
    }
}
