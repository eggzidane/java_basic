package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException 이유 bigdata.data 은 null로 초기화되기때문에 null.value로 참조할곳이없기때문이다.
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
