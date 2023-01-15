public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {

    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles) {
        super(id, mid, fin, conf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float computeTotalScore() {
        return super.computeTotalScore() + articleScore();
    }

    @Override
    public float articleScore() {
        return numberOfArticles * 8;
    }
}
