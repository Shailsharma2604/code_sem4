
class NonGen{
    Object ob;
    NonGen(Object o){
        ob = o;
    }

    Object getData(){
        return ob;
    }

    void Showtype(){
        System.out.println("Type is : "+ ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
       NonGen iob;
       iob = new NonGen(78);
       iob.Showtype();

       int v= (Integer) iob.getData();
       System.out.println("value : "+v);

///////////////////////////////////////////////////////////////////

       NonGen strob;
       strob = new NonGen("Non-Generics Test");
       iob.Showtype();

       String str = (String) strob.getData();
       System.out.println("value : "+str);

       iob = strob;
       int value = (Integer) iob.getData();
       System.out.println("value : "+value);
    }
}
