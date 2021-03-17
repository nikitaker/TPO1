package domainModel;

public class AirBag {
    AirBagStatus status = AirBagStatus.NOTREADY;

    boolean isReady(){
        return status == AirBagStatus.READY;
    }

    void explode(){
        if(this.isReady()){
            status = AirBagStatus.EXPLODED;
        }
    }

    public boolean isExploded() {return status == AirBagStatus.EXPLODED;}

    void beReady(){
        if(status == AirBagStatus.NOTREADY)
        {
            status = AirBagStatus.READY;
        }
    }
}
