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


        List<Golfer> pirates = DBGolfer.getAll();

            System.exit(0);

        }


    }


