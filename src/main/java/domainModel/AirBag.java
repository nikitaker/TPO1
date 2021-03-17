package domainModel;

public class AirBag {
    AirBagStatus status = AirBagStatus.READY;

    void explode(){
        if(status == AirBagStatus.READY){
            status = AirBagStatus.EXPLODED;
        }
    }

    void beReady(){
        if(status == AirBagStatus.NOTREADY)
        {
            status = AirBagStatus.READY;
        }
    }
}
