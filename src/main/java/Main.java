import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //TaskOne();
        //TaskTwo();
        TaskThree();
    }

    public static void TaskOne() {
        Integer[] iArray = {1,2,3,4,5,6,7,8,9,0};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,0.0};
        String[] sArray = {"one","two","three","four","five","six","seven"};
        try {     swapTwoElementsInArray(iArray, 0, 2);
            swapTwoElementsInArray(dArray, 0, 2);
            swapTwoElementsInArray(sArray, 0, 2);

        }catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Swap result in integer array: " + Arrays.toString(iArray));
        System.out.println("Swap result in double array: " + Arrays.toString(dArray));
        System.out.println("Swap result in string array: " + Arrays.toString(sArray));
    }

    private static void swapTwoElementsInArray(Object[] array, int firstNumPos, int secondNumPos) throws WrongPositionException {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        Object temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }


    public static void TaskTwo () {
        Integer[] iArray2 = {1,2,3,4,5,6,7,8,9,0};
        Double[] dArray2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,0.0};
        String[] sArray2 = {"one","two","three","four","five","six","seven"};
        arrayToArrayList(iArray2);
        arrayToArrayList(dArray2);
        arrayToArrayList(sArray2);
        System.out.println(Arrays.toString(iArray2));
        System.out.println(Arrays.toString(dArray2));
        System.out.println(Arrays.toString(sArray2));

    }
    private static <T> ArrayList arrayToArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
    public static void TaskThree() {
        Box<Apple> boxWithApple = new Box<>(new Apple(),new Apple(),new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println("A box of apples weighs " + boxWithApple.getWeight());
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());
        System.out.println(anotherBoxWithOranges.getBox());
    }
    }


