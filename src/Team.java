import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class Team {
    String projectName;
    String features;
    String stackholders;
    double budget;
    Date deadline;
}
