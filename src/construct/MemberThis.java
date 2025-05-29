package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //this 생략해도됨 this는 매개변수 -> 멤버변수순으로 찾아감
    }
}
