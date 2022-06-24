package Arrays;

public class Dynamic_Array {

    private int arr[];
    private int newElementIndex;

    public Dynamic_Array(){
        arr = new int[5];
        newElementIndex = 0;
    }

    public void add(int i) {
        if(newElementIndex == arr.length){
            doubleCapacity();
        }
        arr[newElementIndex] = i;
        newElementIndex++;
    }

    private void doubleCapacity() {
        int[] temp = arr;
        arr = new int[2*temp.length];
        for (int i=0;i<temp.length;i++){
            arr[i] = temp[i];
        }
    }

    public int size() {
        return newElementIndex;
    }

    public int get(int i) {
        if(i>=newElementIndex){
            //throw error
            return -1;
        }
        return arr[i];
    }

    public void set(int index, int element) {
        if(index>=newElementIndex){
            //throw error
            return;
        }
        arr[index] = element;
    }

    public boolean isEmpty() {
        return newElementIndex==0;
    }

    public int removeLast() {
        if(newElementIndex==0){
            return -1;
        }
        int temp = arr[newElementIndex-1];
        newElementIndex--;
        return  temp;
    }
}
