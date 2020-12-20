
package assignementskincare;

public class CategorySkincare {
     
        String cleansing;
        String moisturing;
        String serum;
        String toner;
    

        public CategorySkincare(String cleansing, String moisturing, String serum, String toner){
            this.cleansing = cleansing;
            this.moisturing = moisturing;
            this.serum = serum;
            this.toner = toner;
        }

  
        public void getcleansing(String cleansing){
            this.cleansing = cleansing;
        }
        
        public void getmoisturing(String moisturing){
            this.moisturing = moisturing;
        }
        public void getserum(String serum){
            this.serum = serum;
        }
        public void gettoner(String toner){
            this.toner = toner;
        }
        public String getcleansing(){
            return cleansing;
        }
        public String getmoisturing(){
            return moisturing;
        }
        public String getserum(){
            return serum;
        }
        public String gettoner(){
            return toner;
        }
        @Override
        public String toString(){
            return cleansing + moisturing + serum + toner;
        }
    }