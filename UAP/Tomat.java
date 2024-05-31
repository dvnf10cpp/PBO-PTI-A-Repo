

public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        setMasaHidup(100);
        setBerbuah(100);
        setPerkembangan(0.25);
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
