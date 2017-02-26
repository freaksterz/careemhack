package com.hareem.hack.models;

/**
 * Created by aman on 25/2/17.
 */


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="partners")
public class LogisticPartner {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "logisticId")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "company_name")
    private String companyName;

    @Column(name ="is_active")
    private boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "routeId", cascade = {CascadeType.ALL})
    private List<Route> routes;

    public LogisticPartner() {
    }

    public LogisticPartner(String name, String companyName, boolean isActive, List<Route> routes) {
        this.name = name;
        this.companyName = companyName;
        this.isActive = isActive;
        this.routes = routes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "LogisticPartner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", isActive=" + isActive +
                ", routes=" + routes +
                '}';
    }
}
