package Beans;

public abstract class Individual {
    protected double fitness = -1;
    
    protected ArrayList<IGene> genome;
    
    
    protected abstract void Mutate();
    protected abstract double Evaluate();

    public double getFitness() {
        return fitness;
    }    
}