public class Frigorifico {
    private String local;
    private int temperatura;

    public int ajustarTemperatura() {
        if (temperatura > 0) {
            System.out.println("você deve aumentar temperatura");
        }
        return 0;
    }

        public String getLocal () {
            return local;
        }

        public void setLocal (String local){
            this.local = local;
        }

        public int getTemperatura () {
            return temperatura;
        }

        public void setTemperatura ( int temperatura){
            this.temperatura = temperatura;
        }
    }

