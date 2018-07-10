import db.DBGolfer;
import models.Golfer;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Terry", "Golf", 38);
        DBGolfer.save(golfer1);
        Golfer golfer2 = new Golfer("Barry", "Swing", 58);
        DBGolfer.save(golfer2);
        Golfer golfer3 = new Golfer("Peter", "Putt", 38);
        DBGolfer.save(golfer3);


        List<Golfer> golfers = DBGolfer.getAll();
        for (Golfer golfer : golfers) {
            System.out.println(golfer.getFirstName() + " " + golfer.getLastName());
        }

        Golfer golfPerson = DBGolfer.find(golfer2.getId());
        System.out.println(golfPerson.getFirstName());




        Golfer golferByName = DBGolfer.findByName("Peter");
        System.out.println(golferByName.getFirstName() + " " + golferByName.getLastName());



        System.exit(0);

    }


    }


