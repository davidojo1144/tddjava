package davework;

public class Weekly {
    public enum Days{
        MONDAY("Math, English"),
        TUESDAY("Geography, Biology"),
        WEDNESDAY("English, Biology"),
        THURSDAY("Goland, Chemistry");

        private final String Usage;

       Days(String Usage){
            this.Usage = Usage;
        }

        public String getUsage(){
            return Usage;
        }

       /* static public Days forDaysIgnoreCase(String day){
            for(Days d : Days.values()){
                if(d.getUsage().equalsIgnoreCase(day)) return d;
            }
            return null;*/

    }

    public String monday(){
        return Days.MONDAY.getUsage();
    }
    public String tuesday(){
        return Days.TUESDAY.getUsage();
    }
    public String wednesday(){
        return Days.WEDNESDAY.getUsage();
    }
    public String thursday(){
        return Days.THURSDAY.getUsage();
    }
}
