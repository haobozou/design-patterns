public class ConcreteColleague2 implements Colleague {
    private Mediator mediator;

    @Override
    public void changed() {
        this.mediator.colleagueChanged(this);
    }
}