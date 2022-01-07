package patterns.behavioral.state.bake;

import lombok.Setter;
import patterns.behavioral.state.bake.state.State;

public class Bake {
    @Setter
    private State state;

    public Bake() {
        this.state = new ColdState();
    }

    public String bake() {
        return state.bake();
    }

    public String switchOn() {
        return state.switchOn();
    }

    public String switchOff() {
        return state.switchOff();
    }

    private class ColdState implements State {

        @Override
        public String bake() {
            throw new IllegalStateException("State is cold");
        }

        @Override
        public String switchOn() {
            Bake.this.setState(new ReadyState());
            return "preparing to bake";
        }

        @Override
        public String switchOff() {
            return "bake if off";
        }
    }

    private class ReadyState implements State {
        @Override
        public String bake() {
            return "make pizza";
        }

        @Override
        public String switchOn() {
            Bake.this.setState(new OverheatState());
            return "working, overheat";
        }

        @Override
        public String switchOff() {
            Bake.this.setState(new ColdState());
            return "switched off";
        }
    }

    private class OverheatState implements State {

        @Override
        public String bake() {
            throw new IllegalStateException("State is overheat");
        }

        @Override
        public String switchOn() {
            return "State is overheat";
        }

        @Override
        public String switchOff() {
            Bake.this.setState(new ReadyState());
            return "ready to bake";
        }

    }
}
