public class BachelourStudent extends Student implements ProjectScoreBehavior{

    public BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projectScore() {
        return 20;
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore() + projectScore();
    }
}
