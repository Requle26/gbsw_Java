package freeStud.Unsolved;

public class Main {
public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Device device = outer.new Device();

        Action action = device;
        action.act();

        Machine machine = device;
        System.out.print("S" + machine.score() + " ");

        Outer.Device.Panel panel = device.new Panel();
        panel.show();

        Action.Reporter reporter = new Outer.ReporterImpl();
        reporter.report(machine.score());
    }
}

