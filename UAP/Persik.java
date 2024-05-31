
public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        setMasaHidup(180);
        setBerbuah(250);
        setPerkembangan(0.15);
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
        setPerkembangan(getPerkembangan() + 0.025);
    }
}
