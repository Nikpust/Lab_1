package LAB_1.demo;

public class coin {
    String coin_name;
    String coin_code;
    float price;
    float h1;
    float h24;
    float d7;
    double market_cap;
    double volume;
    float last_price[];

    public coin(String coin_name, String coin_code, float price, float h1, float h24, float d7, double market_cap, double volume, float last_price[]) {
        this.coin_name = coin_name;
        this.coin_code = coin_code;
        this.price = price;
        this.h1 = h1;
        this.h24 = h24;
        this.d7 = d7;
        this.market_cap = market_cap;
        this.volume = volume;
        this.last_price = last_price;
    }

    public String getCoin_name() {
        return coin_name;
    }

    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }

    public String getCoin_code() {
        return coin_code;
    }

    public void setCoin_code(String coin_code) {
        this.coin_code = coin_code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getH1() {
        return h1;
    }

    public void setH1(float h1) {
        this.h1 = h1;
    }

    public float getH24() {
        return h24;
    }

    public void setH24(float h24) {
        this.h24 = h24;
    }

    public float getD7() {
        return d7;
    }

    public void setD7(float d7) {
        this.d7 = d7;
    }

    public Double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public float[] getLast_price() {
        return last_price;
    }

    public void setLast_price(float[] last_price) {
        this.last_price = last_price;
    }
}
