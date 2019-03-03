


public class Queue{
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
        if (lastIndex != 0){
            for (int i = 0; i < this.lastIndex; i++){
                this.values[i] = this.values[i+1];
            }
            this.lastIndex--;
            return this.values[0];
        } else {
            return -1;
        }
    }
    public void push(int value){
        this.values[this.lastIndex] = value;
        this.lastIndex++;
    }
}