
class _box_{
    int num;
    _box_(int num){
        this.num=num;
        System.out.println("the value of num : "+num);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        _box_ obj=new _box_(10);
        System.out.println("obj_1 : "+obj.num);
        
        
    }
}
