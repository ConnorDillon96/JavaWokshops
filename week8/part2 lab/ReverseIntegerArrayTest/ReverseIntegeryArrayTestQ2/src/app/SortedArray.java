package app;

// this is a cut down version of the class specifically for the Reverse test
// the complete version is in the Library folder on Moodle

public class SortedArray implements SortedADT {

    // implement collection using an array
    protected Comparable[] objects;
    protected Integer objectCount;

    public SortedArray(Integer arraySize) {
        this.objects = new Comparable[arraySize];
        this.objectCount = 0;
    }

    public String toString() {
        String arrayDetails = new String();
        if (this.objectCount != 0) {
            for (Integer index = 0; index < this.objectCount; index++) {
                arrayDetails += objects[index] + "\n";
            }
        } else {
            arrayDetails += "array is empty";
        }
        return arrayDetails;
    }

    public void insert(Comparable object){
        // cut down version, for this test objects are added in order
        this.objects[this.objectCount] = object;
        this.objectCount++;
    }
}
