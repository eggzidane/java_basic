package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview thunderbolts = new MovieReview();
        thunderbolts.title = "썬더볼츠";
        thunderbolts.review = "재밌다";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] movies = {thunderbolts,aboutTime};
        for (MovieReview movie : movies) {
            System.out.println("영화 제목: " + movie.title + " 영화 후기: " + movie.review);
        }
    }
}
