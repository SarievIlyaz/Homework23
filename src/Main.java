import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int [] array = new int[size];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer>linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(0,2));
            linkedList.add(random.nextInt(0,2));
            array[i] = random.nextInt(0,2);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println();

        sortArrays(array);
        sortArray(arrayList);
        sortArray(linkedList);

    }
    public static void sortArrays(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Array: "+Arrays.toString(numbers));

    }
    public static void sortArray(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        System.out.println("ArrayList: "+numbers);
    }
    public static void sortArray(LinkedList<Integer> numbers){
        Collections.sort(numbers);
        System.out.println("LinkedList: "+numbers);

    }
}