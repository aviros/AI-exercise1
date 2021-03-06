package simulator;

import config.HurricaneGraph;
import lombok.Getter;
import lombok.Setter;

public class SimulatorContext {

    @Getter @Setter
    private HurricaneGraph graph;

    @Getter @Setter
    private int deadline;

    @Getter @Setter
    private double k;

    @Getter @Setter
    private double time;

    @Getter @Setter
    private double f;

    public SimulatorContext() {
    }

    public SimulatorContext(SimulatorContext cloneContext){
        this.graph = cloneContext.graph.clone();
        this.deadline = cloneContext.getDeadline();
        this.k = cloneContext.getK();
        this.time = cloneContext.getTime();
    }


}
