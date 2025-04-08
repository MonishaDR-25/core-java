package in.moni.internal;

public class Mutant {
    private String dnaSequence="RNA";
    private int powerLevel=80;
    private boolean canRegenerate=false;
    private double mutationRate=4.6;
    private String origin="human";
//setter or mutator(init)
    void setDnaSequence(String dnaSequence) {
        this.dnaSequence = dnaSequence;
    }
    void setPowerLevel(int powerLevel){
        this.powerLevel=powerLevel;
    }
    void setCanRegenerate(boolean canRegenerate){
        this.canRegenerate=canRegenerate;
    }
    void setMutationRate(double mutationRate){
        this.mutationRate=mutationRate;
    }
    void setOrigin(String origin){
        this.origin=origin;
    }

    //getter or accessor
    public String getDnaSequence(){
        return dnaSequence;
    }
    public int getPowerLevel() {
        return powerLevel;
    }

    public boolean isCanRegenerate() {
        return canRegenerate;
    }

    public double getMutationRate() {
        return mutationRate;
    }

    public String getOrigin() {
        return origin;
    }

}
