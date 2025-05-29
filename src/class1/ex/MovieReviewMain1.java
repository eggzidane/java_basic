package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview thunderbolts = new MovieReview();

        thunderbolts.title = "썬더볼츠";
        thunderbolts.review = "재밌다";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목: " + thunderbolts.title + " 영화 후기: " + thunderbolts.review);
        System.out.println("영화 제목: " + aboutTime.title + " 영화 후기: " + aboutTime.review);
    }
}
