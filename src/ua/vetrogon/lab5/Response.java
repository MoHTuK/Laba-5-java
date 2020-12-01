package ua.vetrogon.lab5;

public class Response {
    private float coins_count;
    private float active_markets;
    private float total_mcap;
    private float total_volume;
    private String btc_d;
    private String eth_d;
    private String mcap_change;
    private String volume_change;
    private String avg_change_percent;
    private float volume_ath;
    private float mcap_ath;

    public Response(float coins_count, float active_markets, float total_mcap, float total_volume, String btc_d, String eth_d, String mcap_change, String volume_change, String avg_change_percent, float volume_ath, float mcap_ath) {
        this.coins_count = coins_count;
        this.active_markets = active_markets;
        this.total_mcap = total_mcap;
        this.total_volume = total_volume;
        this.btc_d = btc_d;
        this.eth_d = eth_d;
        this.mcap_change = mcap_change;
        this.volume_change = volume_change;
        this.avg_change_percent = avg_change_percent;
        this.volume_ath = volume_ath;
        this.mcap_ath = mcap_ath;
    }

    @Override
    public String toString() {
        return "Information about crypto market:" +
                "\ncoins count\t" + coins_count +
                "\nactive markets\t" + active_markets +
                "\ntotal mcap\t" + total_mcap +
                "\ntotal volume\t" + total_volume +
                "\nbtcd\t" + btc_d +
                "\nethd\t" + eth_d +
                "\nmcap change\t" + mcap_change +
                "\nvolume change\t" + volume_change +
                "\navg change percent\t" + avg_change_percent +
                "\nvolume ath\t" + volume_ath +
                "\nmcap ath\t" + mcap_ath;
    }
}