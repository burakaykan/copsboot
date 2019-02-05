package com.example.copsboot.report.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateReportParameters {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime dateTime;

    @ValidReportDescription
    private String description;

    private boolean trafficIncident;
    private int numberOfInvolvedCars;

    @NotNull
    private MultipartFile image;

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTrafficIncident() {
        return trafficIncident;
    }

    public void setTrafficIncident(boolean trafficIncident) {
        this.trafficIncident = trafficIncident;
    }

    public int getNumberOfInvolvedCars() {
        return numberOfInvolvedCars;
    }

    public void setNumberOfInvolvedCars(int numberOfInvolvedCars) {
        this.numberOfInvolvedCars = numberOfInvolvedCars;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
