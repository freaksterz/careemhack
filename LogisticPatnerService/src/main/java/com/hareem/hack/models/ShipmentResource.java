package com.hareem.hack.models;

import javax.persistence.*;

/**
 * Created by aman on 25/2/17.
 */
@Entity
@Table(name = "shipmentresource")
public class ShipmentResource {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "srId")
    int srId;

    int minWeight;
    int maxWeight;

    public ShipmentResource() {
    }

    public ShipmentResource(int minWeight, int maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    /*@Enumerated(EnumType.STRING)
    private Enum dimensionRange;

    @Enumerated(EnumType.STRING)
    private Enum typeOfParcel;*/

    public int getSrId() {
        return srId;
    }

    public void setSrId(int srId) {
        this.srId = srId;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

}
