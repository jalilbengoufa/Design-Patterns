package Example1;

public class TeamA extends Training {

    @Override
    void morning() {
        System.out.print(" 3 hours run / ");
    }

    @Override
    void afternoon() {
        System.out.print(" 200 pushups /");
    }

    @Override
    void night() {
        System.out.print("sleep \n");
    }
}
