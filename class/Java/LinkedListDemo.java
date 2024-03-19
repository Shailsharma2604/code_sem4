public class LinkedListDemo {
    public static void main(String[] args) {
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Content of al :- "+al);

        Integer ia[]=new Integer[al.size()];
        ia=al.toArray(ia);

        int sum=0;
        for(int i:ia)
            sum+=i;
            
        System.out.println("Content of array :- "+sum);
        
        System.out.println("Content of array :- "+ia);
    }
}
