

public class Stack{
    int[] values = new int[300];
    int lastIndex = 0;
    public int[] toArray(){
        int[] newArray = new int[this.lastIndex];
        for (int i = 0; i < this.lastIndex; i++){
            newArray[i] = this.values[i];
        }
        return newArray;
    }
    public int pop(){
        int res = this.values[this.lastIndex];
        this.values[this.lastIndex] = 0;
        this.lastIndex--;
        return res;
    }
    public void push(int value){
        this.values[this.lastIndex] = value;
        this.lastIndex++;
    }
}