package pl.pjatk.jaz_s27144_nbp;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Waluta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Index", name = "ID", type = "int", example = "1,2,3,4,5")
    private int ID;
    @Schema(
            description = "Waluta",
            name = "waluta",
            type = "String",
            example = "PLN,EUR, USD, JPY")
    private String waluta;
    @Schema(
            description = "Poczatkowa data zakresu wyszukiwan (YYYY-MM-DD)",
            name = "start_date",
            type = "Date",
            example = "2022-10-05")
    private Date start_date;
    @Schema(
            description = "Koncowa data zakresu wyszukiwan (YYYY-MM-DD)",
            name = "end_date",
            type = "Date",
            example = "2022-12-06")
    private Date end_date;
    @Schema(
            description = "Wyliczona srednia stawka kursu",
            name = "kurs",
            type = "float",
            example = "4.36")
    private float kurs;
    @Schema(
            description = "Time of",
            name = "time",
            type = "Date",
            example = "4.36")
    private Date time;

    public Waluta(int ID, String waluta, Date start_date, Date end_date, float kurs, Date time) {
        this.ID = ID;
        this.waluta = waluta;
        this.start_date = start_date;
        this.end_date = end_date;
        this.kurs = kurs;
        this.time = time;
    }

    public Waluta() {

    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public int getID() {
        return ID;
    }

    public String getWaluta() {
        return waluta;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public float getKurs() {
        return kurs;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setKurs(float kurs) {
        this.kurs = kurs;
    }



}








