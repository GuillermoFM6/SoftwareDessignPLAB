public class NBodySimulator {
  private String f;
  private double t;
  private int pT;
  private boolean d;
  private int n;

  public NBodySimulator(String fname, double dt, int pauseTime, boolean do_trace) {
    this.f = fname;
    this.t = dt;
    this.pT = pauseTime;
    this.d = do_trace;
  }

  public NBodySimulator(int numBodies){
    this.n = n;
  }
  public void draw(Body b) {
    StdDraw.setPenRadius(0.025);
    StdDraw.point(b.getPosition().cartesian(0), b.getPosition().cartesian(1));
  }

  // this method is only needed if you want to change the size of the bodies
  public void draw(Body b, double penRadius) {
    StdDraw.setPenRadius(penRadius);
    StdDraw.point(b.getPosition().cartesian(0), b.getPosition().cartesian(1));
  }

  // draw the n bodies
  public void draw(Universe u) {
    for (int i = 0; i < u.getNbodies(); i++) {
      draw(u.getBody(i));
    }
  }
  //simulate the universe
  public void simulate(){
    if(d == false) {
      newton = new Universe(f);
      StdDraw.enableDoubleBuffering();
      while (true) {
        StdDraw.clear();
        newton.increaseTime(t);
        newton.draw();
        StdDraw.show();
        StdDraw.pause(pT);
      }
    }
    else {
        StdDraw.setCanvasSize(700, 700);
        UniverseTrace newton = new UniverseTrace(f);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        while (true) {
          StdDraw.setPenColor(StdDraw.WHITE);
          newton.draw();
          newton.increaseTime(t);
          StdDraw.setPenColor(StdDraw.BLACK);
          newton.draw();
          StdDraw.show();
          StdDraw.pause(pT);
        }
    }

  }


  // client to simulate a universe
  // In IntelliJ : Run -> Run... -> Edit configurations -> Program arguments 10000 data/3body.txt
  public static void main(String[] args) {
    NBodySimulator nbody;
    int numargs = args.length;
    if ((numargs==3) || (numargs==4)) {
      double dt = Double.parseDouble(args[0]);
      String fname = args[1];
      int pauseTime = Integer.parseInt(args[2]);
      boolean do_trace = false;
      if (args.length == 4) {
        do_trace = args[3].toLowerCase().equals("trace");
      }
      nbody = new NBodySimulator(fname, dt, pauseTime,
          do_trace);
      nbody.simulate();
    } else if (numargs==1) {
      int numBodies = Integer.parseInt(args[0]);
      nbody = new NBodySimulator(numBodies);
      nbody.simulate();
    } else {
      assert false : "invalid number of arguments";
    }
  }
}
