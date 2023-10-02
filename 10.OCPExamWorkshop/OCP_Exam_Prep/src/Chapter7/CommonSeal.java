package Chapter7;

public class CommonSeal extends HarborSeal {
    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }

}

abstract class HarborSeal implements HasTail, HasWhiskers {
}
