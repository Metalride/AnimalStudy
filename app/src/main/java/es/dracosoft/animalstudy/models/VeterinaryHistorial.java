package es.dracosoft.animalstudy.models;

import java.sql.Date;

/**
 * Created by Dracosoft.es on 31/03/2017.
 *
 * @Author Jesús Román Fernández
 * @Version 0.1
 * Class that define the veterinary history from each animal
 */

public class VeterinaryHistorial {
    private int id;
    private Date startHistory;
    private int chipNumber;
    private ClinicReport[] reports;

}
