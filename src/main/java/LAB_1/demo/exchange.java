package LAB_1.demo;

public class exchange {
    String name;
    Float score;
    Float volume24h;
    Float markets;
    Float coins;
    Float last_volume[];

    public exchange(String name, Float score, Float volume24h, Float markets, Float coins, Float last_volume[]) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.last_volume = last_volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(Float volume24h) {
        this.volume24h = volume24h;
    }

    public Float getMarkets() {
        return markets;
    }

    public void setMarkets(Float markets) {
        this.markets = markets;
    }

    public Float getCoins() {
        return coins;
    }

    public void setCoins(Float coins) {
        this.coins = coins;
    }

    public Float[] getLast_volume() {
        return last_volume;
    }

    public void setLast_volume(Float[] last_volume) {
        this.last_volume = last_volume;
    }
}
