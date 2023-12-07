public class Shepard extends Dog implements Serviceable, Serviceable2 {
    @Override
    public void serve(String command) {
        System.out.println("SERVE: " + command);
    }

    @Override
    public void serve2(String command) {
        Serviceable.super.serve2(command);
        Serviceable2.super.serve2(command);
    }
}
