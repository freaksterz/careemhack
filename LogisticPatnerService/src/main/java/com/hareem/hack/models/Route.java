package com.hareem.hack.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by aman on 25/2/17.
 */
@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "routeId")
    private int routeId;
    private String from;
    private String to;
    private int intervalTime;   // millseconds
    private int cost;       // support multi currency later

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "srId", cascade={CascadeType.ALL})
    List<ShipmentResource> resources;

    public Route() {
    }

    public Route(String from, String to, int intervalTime, int cost, List<ShipmentResource> resources) {
        this.from = from;
        this.to = to;
        this.intervalTime = intervalTime;
        this.cost = cost;
        this.resources = resources;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<ShipmentResource> getResources() {
        return resources;
    }

    public void setResources(List<ShipmentResource> resources) {
        this.resources = resources;
    }
}
