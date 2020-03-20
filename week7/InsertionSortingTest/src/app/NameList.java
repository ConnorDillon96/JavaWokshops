package app;

public class NameList {
    Name[] names;
    int count = 0;


    NameList(int size){
        this.names = new Name[size];
    }

    public void addNewName(String name){
        Name temp = new Name(name);
        names[count] = temp;
        count ++;

    }

    public void sort(){
        InsertionSort.sort(names);
    }


    @Override
    public String toString() {
        String fullList = "";
        for (Name name : names) {
            if (name == null){}
            else{
                fullList += name +"\n";
            }
            
        }
        return fullList;
    }


    
}