package televisor;

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        System.out.println(tv);
        tv.mudarDeCanal((short) 10);
        tv.mudarDeVolume((byte) 40);
        System.out.println(tv);
        tv.diminuirVolume();
        System.out.println(tv);
    }
}

class Televisor {

    private byte volume;
    private short canal;

    public Televisor() {
        this.volume = 20;
        this.canal = 1;
    }

    public boolean mudarDeCanal(short canal) {
        if (canal < 1 || canal > 500)
            return false;
        this.canal = canal;
        return true;
    }

    public short canalAtual() {
        return this.canal;
    }

    public boolean aumentarVolume() {
        if (this.volume == 100)
            return false;
        if (this.volume + 10 >= 100) {
            this.volume = 100;
        } else {
            this.volume += 10;
        }
        return true;
    }

    public boolean diminuirVolume() {
        if (this.volume == 0)
            return false;
        if (this.volume - 10 <= 0) {
            this.volume = 0;
        } else {
            this.volume -= 10;
        }
        return true;
    }

    public boolean mudarDeVolume(byte volume) {
        if (volume < 1 || volume > 100)
            return false;
        this.volume = volume;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Canal: ")
                .append(this.canal)
                .append(" Volume: ")
                .append(this.volume);
        return sb.toString();
    }

}
