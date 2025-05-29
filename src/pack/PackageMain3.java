package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 클래스이름 같으면 import는 한 패키지만가능 나머지는 전체경로적어야함


        
    }
}
