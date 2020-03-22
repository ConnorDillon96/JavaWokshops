
public class IntegerArray {
    private Integer[] integers;

    public IntegerArray(Integer[] integers){
        this.integers=new Integer[integers.length];
        // copy the array parameter to the attribute
        for(Integer index=0;index<this.integers.length;index++)
            this.integers[index]=integers[index];
    }
    
    public String toString(){
        // add the call to the recursive version here
        String answer = "";
        int pos = 0;
        return toStringHelper(answer, pos); 

    }
    
    // add the recursive version here
    public String toStringHelper(String answer, int pos){
        if(pos==integers.length){
            return answer;
        }else{
            answer += integers[pos];
            pos++;
        }

        return toStringHelper(answer, pos);

    }
    
    
    public Integer getTotal(){
        // add the call to the recursive version here
        int total = 0;
        int index = 0;
        return getTotoalHelper(total, index);
        
    }
    
    // add the recursive version here
    public Integer getTotoalHelper(int total, int index){
        if(index == integers.length){
            return total;
        }else{
            total += integers[index];
            index++;
        }
        return getTotoalHelper(total, index);


    }

}

