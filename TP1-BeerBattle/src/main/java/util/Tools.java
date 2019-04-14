package util;

public class Tools {
    static int eventId=0;
    static int locationId=0;
    static int cityId=0;

    public static int fRandomRange(int min, int max){
        int n = (int) (Math.random() * (max-min)+min);
        return n;
    }

    public static int fRandomAge(){
        return fRandomRange(15,70);
    }

    public static int fRandomDNI(){
        return fRandomRange(10000000,90000000);
    }

    public static int fRandomWeight(){
        return fRandomRange(60,140);
    }

    public static String fVikingName(){
        String[] names = {"Aren","Axe","Bjorn","Daven","Egil","Einar","Esben","Erik","Gerd","Gisli","Haakon","Helge","Harald","Hans","Ivar","Jensen","Jorgen","Lars","Niels","Odin","Olaf","Olson","Sigurd","Sven","Thor","Viggo","Thorlot","Valdis","Vidgis"};

        return names[fRandomRange(0,names.length)];
    }

    public static String fSpartanName(){
        String[] names = {"Aquiles","Adonis","Adrian","Alesandro","Basil","Bemus","Caesar","Calix","Cristophe","Cole","Damen","Darius","Dimitrius","Dennis","Eugene","Felipe","Giles","Griffin","Hercules","Homero","Icaro","Jerry","Julian","Karan","Kosmos","Kristo","Mackenzie","Mateo","Maximus"};

        return names[fRandomRange(0,names.length)];
    }

    public static String fName(){
        String[] names = {"Andrea","Beatriz","Claudio","Alba","Alex","Benito","Javier","Bernarda","Sergio","Anibal","Juan","Nicolas","Nahuel","Sofia","Manuel"};

        return names[fRandomRange(0,names.length)];
    }

    public static String fLastName(){
        String[] lastNames = {"Gomez","Garcia","Fernandez","Juarez","Macricio","Lopez","Perez","Stua","Duran","Grande","Guerrero","Yamaha","Teruel","Valenciano","Catalan"};

        return lastNames[fRandomRange(0,lastNames.length)];
    }

    public static String fEventName(){
        String[] eventNames = {"IKEA","Makro","Malvinas","MacriGato","Tupac","Jarry","UBU","Vian","EraserHead","Lola","Lili Marlen","Yamaha","Lobo-Hombre","Fassbinder","Zappa"};

        return eventNames[fRandomRange(0,eventNames.length)];
    }

    public static String fLocationName(int i){
        String[] locations = {"Centro de Deportes","Auditorium","Teatro Colon","Minela","Polideportivo","Chapadmalal","Batan","Carcel","Municipalidad","Ferroautomotora","Punta Mogotes","Faro","La Reserva del Mar","Bosques del Faro","La Caseta"};

        return locations[i];
    }

    public static String fCityName(int i){
        String[] cities = {"Mar del Plata","Paris","Londres","New York","Madrid","Barcelona","Valencia","Buenos Aires","Rosario","Cordoba","Alicante","Miami","Los Angeles","Rio de Janeiro","Bruselas"};

        return cities[i];
    }

    public static int fNewEventId() {
        eventId++;
        return eventId;
    }

    public static int fNewLocationId() {
        locationId++;
        return locationId;
    }

    public static int fNewCityId() {
        cityId++;
        return cityId;
    }

    public static void fPause(int millis){
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {}
    }
}
