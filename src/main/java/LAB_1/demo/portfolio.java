package LAB_1.demo;

import java.util.ArrayList;
import java.util.List;

public class portfolio {
    List<coin> coins = new ArrayList<>();
    public List<deal> deals = new ArrayList<>();
    float profile_volume_usd[];
    float profile_volume_btc[];
    float current_volume_usd;
    float current_volume_btc;

    public void add_coin(String coin_name, String coin_code, float price, float h1, float h24, float d7, double market_cap, double volume, float last_price[]) {
        coin newCoin = new coin(coin_name, coin_code, price, h1, h24, d7, market_cap, volume, last_price);
        coins.add(newCoin);
    }

    public void add_deal(String date, String type, Float price, Float volume, String coin_name, String coin_code) {
        deals.add(new deal(date, type, price, volume, coin_name, coin_code));
    }

    public portfolio() {
        this.profile_volume_usd =  new float[]{324.0f, 436.0f, 584.0f, 987.0f, 674.0f};
        this.profile_volume_btc =  new float[]{324.0f, 436.0f, 584.0f, 987.0f, 674.0f};
        this.current_volume_usd = 345f;
        this.current_volume_btc = 345f;
    }

    public List<coin> getCoins() {
        return coins;
    }

    public void setCoins(List<coin> coins) {
        this.coins = coins;
    }

    public List<deal> getDeals() {
        return deals;
    }

    public void setDeals(List<deal> deals) {
        this.deals = deals;
    }

    public float[] getProfile_volume_usd() {
        return profile_volume_usd;
    }

    public void setProfile_volume_usd(float[] profile_volume_usd) {
        this.profile_volume_usd = profile_volume_usd;
    }

    public float[] getProfile_volume_btc() {
        return profile_volume_btc;
    }

    public void setProfile_volume_btc(float[] profile_volume_btc) {
        this.profile_volume_btc = profile_volume_btc;
    }

    public float getCurrent_volume_usd() {
        return current_volume_usd;
    }

    public void setCurrent_volume_usd(float current_volume_usd) {
        this.current_volume_usd = current_volume_usd;
    }

    public float getCurrent_volume_btc() {
        return current_volume_btc;
    }

    public void setCurrent_volume_btc(float current_volume_btc) {
        this.current_volume_btc = current_volume_btc;
    }
}