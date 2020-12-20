
package assignementskincare;

public class BrandsSkincare {
 
    String Safi;
    String Loreal;
    String Simple;
    String Himalaya;
    String Biore;

    BrandsSkincare(String pack1, String pack2, String pack3, String pack4, String pack5) {
        this.Safi = pack1;
        this.Loreal = pack2;
        this.Simple = pack3;
        this.Himalaya = pack4;
        this.Biore = pack5;
    }

    public void setString(String pack1, String pack2, String pack3, String pack4, String pack5) {
        this.Safi = "Cleansing + moisturing + serum + toner";
        this.Loreal = "Mosituring + serum";
        this.Simple = "Cleansing+ toner + moisturing + serum";
        this.Himalaya = "Cleansing + moisturing";
        this.Biore = "Toner + moisturing";
    }

    public String getStringOne() {
        return Safi;
    }

    public String getStringTwo() {
        return Loreal;
    }

    public String getStringThree() {
        return Simple;
    }

    public String getStringFour() {
        return Himalaya;
    }

    public String getStringFive() {
        return Biore;
    }
    
}

