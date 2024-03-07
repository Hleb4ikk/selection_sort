public class SelectionSort {
    public static int[] Generate_Array(int capacity){
        int[] array = new int[capacity];
        for(int i = 0; i < capacity; i++) array[i] = (int)(Math.random()*100);
        System.out.print("Массив который надо отсортировать: ");
        for(int i = 0; i < capacity; i++) System.out.print(array[i] + " ");
        System.out.println();
        return array;
    }
    public static void Sort(int[] arr){
        int counter = 0;
        for(int i = 0; i< arr.length-1; i++){
            int min_index = i;
            for(int k = i+1; k < arr.length;k++){

                if (arr[k] < arr[min_index]) {

                    min_index = k;

                }
            }
            if(min_index != i){

                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index]= temp;

            }

        }

        System.out.print("Отсортированный массив: ");
        for(int i = 0 ;i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println("\nКоличество сравнений: " + arr.length*arr.length);
        System.out.println("Количество перестановок: " + counter);
    }
    public static void main(String[] args){

        Sort(Generate_Array(100));

    }

}
