package Example1;

public class TeamB extends Training {

    @Override
    void morning() {
        System.out.print(" 6 hours run / ");
    }

    @Override
    void afternoon() {
        System.out.print(" taking a nap /");
    }

    @Override
    void night() {
        System.out.print("team training");
    }
}
