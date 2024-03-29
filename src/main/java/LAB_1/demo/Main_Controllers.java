package LAB_1.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Main_Controllers {
    List<coin> coins = new ArrayList<>();
    List<trend> trends = new ArrayList<>();
    List<exchange> exchanges = new ArrayList<>();
    portfolio PORTFOLIO = new portfolio();

    public Main_Controllers () {
        coins.add(new coin("Bitcoin", "BTC", 50000f, -25f, 23f, 56f, 2303534050432.0, 4395723867.0, new float[]{324f, 436f, 584f, 987f, 674f}));

        PORTFOLIO.add_coin("Bitcoin", "BTC", 50.087876f, -25f, 23f, 56f, 2303534050432.0, 4395723867.0, new float[]{324f, 436f, 584f, 987f, 674f});

        exchanges.add(new exchange("Binance", 9.0f, 364578658725f, 67f, 45f, new Float[]{324f,436f,584f,987f,674f}));

        trends.add(new trend("Bitcoin", "BTC", 23.0f));
    }

    @GetMapping("/coins")
    public List<coin> GET_coins() {
        return coins;
    }

    @GetMapping("/trends")
    public List<trend> GET_trends() {
        return trends;
    }

    @GetMapping("/exchanges")
    public List<exchange> GET_exchanges() {
        return exchanges;
    }

    @GetMapping("/portfolio")
    public portfolio GET_portfolio() {
        return PORTFOLIO;
    }

    @PostMapping("/add-deal")
    public ResponseEntity<deal> POSTDeal(@RequestBody deal deal) {
        PORTFOLIO.add_deal(deal.getDate(), deal.getType(), deal.getPrice(), deal.getVolume(), deal.getCoin_name(), deal.getCoin_code());
        return ResponseEntity.ok(PORTFOLIO.deals.getLast());
    }
}
