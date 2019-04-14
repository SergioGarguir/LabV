import classes.*;

import util.Tools;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Battle {
    public static void main(String[] args) {
        int contVikings=0;
        int contSpartans=0;
        String teamWinner;

        List<Human>  vikingTeam = new ArrayList<>();

        // Genero una lista de Vikingos al azar
        for(int i=0;i<20;i++){
            vikingTeam.add(new Viking(Tools.fVikingName(), Tools.fRandomAge(), Tools.fRandomWeight(), 0, new ToDrinkVikingImp(), new ToPeeVinkingImp(), Tools.fRandomRange(50,100)));
        }

        List<Human>  spartanTeam = new ArrayList<>();

        // Genero una lista de Espartanos al azar
        for(int i=0;i<20;i++){
            spartanTeam.add(new Spartan(Tools.fSpartanName(), Tools.fRandomAge(), Tools.fRandomWeight(), 0, new ToDrinkSpartanImp(), new ToPeeSpartanImp(), Tools.fRandomRange(50,100)));
        }

        // Mustro los listados de cada equipo
        System.out.printf("\nTeam 1: VIKINGS %s\n",vikingTeam);

        System.out.println(String.format("\nTeam 1 VIKINGS age sorted: %s", vikingTeam.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList())));

        System.out.printf("\nTeam 2: SPARTANS %s\n",spartanTeam);

        System.out.println(String.format("\nTeam 2 SPARTANS age sorted: %s", spartanTeam.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList())));

        // Creo la conexion con MySQL
        battleMySQL.makeJDBCConnection();

        // Mientras hay equipo se juega
        while((vikingTeam.size()>0) && spartanTeam.size()>0) {
            Human vikingPlayer = vikingTeam.remove(Tools.fRandomRange(0, vikingTeam.size()));
            Human spartanPlayer = spartanTeam.remove(Tools.fRandomRange(0, spartanTeam.size()));

            System.out.println("__________________________________________________________________________________________");
            System.out.printf("                       Viking %s vs Spartan %s \n",vikingPlayer.getName(),spartanPlayer.getName());
            System.out.printf("\nViking chosen: %s", vikingPlayer);
            System.out.printf("\nSpartan chosen: %s\n", spartanPlayer);

            System.out.printf("\nDrinking...");

            // Aca se realiza la batalla entre un Vikingo y un Espartano seleccionados al azar de cada lista
            while((vikingPlayer.getDrinkedBeer()<=500)&&(spartanPlayer.getDrinkedBeer()<=500)){

                vikingPlayer.setDrinkedBeer(vikingPlayer.getDrinkedBeer()+vikingPlayer.getToDrink().toDrink()-vikingPlayer.getToPee().toPee()-((Viking)vikingPlayer).getProfessionalDrinker());
                spartanPlayer.setDrinkedBeer(spartanPlayer.getDrinkedBeer()+spartanPlayer.getToDrink().toDrink()-spartanPlayer.getToPee().toPee()-((Spartan)spartanPlayer).getExtraTolerance());
                System.out.printf(".");
                //System.out.printf("\n Viking.getDrinkedBeer: %d - Spartan.getDrinkedBeer: %d", vikingPlayer.getDrinkedBeer(),spartanPlayer.getDrinkedBeer());
                Tools.fPause(500);
            }

            // Detecto el ganador
            Human winner = (vikingPlayer.getDrinkedBeer()>spartanPlayer.getDrinkedBeer())?vikingPlayer:spartanPlayer;

            // Cuanto cuantos ganadores por cada bando
            if(winner instanceof Viking){
                teamWinner="Viking";
                contVikings++;
            }else{
                teamWinner="Spartan";
                contSpartans++;
            }

            System.out.printf("\n Winner: %s:", winner);

            System.out.println("");

            // Guardo los datos en la DB
            battleMySQL.addDataToDB(winner.getName(),teamWinner,winner.getDrinkedBeer());

            Tools.fPause(1000);
        }


        battleMySQL.closeJDBCConnection();

        System.out.println("__________________________________________________________________________________________");
        System.out.println("");
        System.out.printf("                               Vikings: %d - Spartans: %d\n",contVikings,contSpartans);
        System.out.println("                            <<<<<<<<< Game Over >>>>>>>>>>");
        System.out.println("__________________________________________________________________________________________");
    }
}
