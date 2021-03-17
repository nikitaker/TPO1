package domainModel;

public enum AirBagStatus {
    READY("Готова"),
    EXPLODED("Взорвана"),
    NOTREADY("Не готова");

    private final String russianVersion;

    AirBagStatus(String russianVersion) {
        this.russianVersion = russianVersion;
    }

    public String getRussianVersion() {
        return russianVersion;
    }

}
