
public class Stroberi extends Tanaman implements Perawatan{
    public Stroberi() {
        setMasaHidup(60);
        setBerbuah(150);
        setPerkembangan(0.35);
    }

    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + (getPerkembangan() * getBerbuah()));
        if (getProsesBerbuah() >= getBerbuah()) {
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            setBuah(getBuah() + 1);
        }
    }

    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.05);
    }
}
