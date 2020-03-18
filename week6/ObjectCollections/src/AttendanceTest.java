public class AttendanceTest{
    public static void main(String[] args){
        // values hard-coded to facilitate testing
        final Integer CLASS_SIZE=15;
        Integer[] attendances={10,14,12,9,11,15,12,13,8,14};
        for (Integer integer : attendances) {
            System.out.println(((float)(integer) / CLASS_SIZE)*100);
            
        }

    }
}