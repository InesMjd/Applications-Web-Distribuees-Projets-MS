package com.example.candidat4sae2;


public class Job {

    private String service;
    private boolean etat;

    public Job() {
    }

    public Job( String service, boolean etat) {

        this.service = service;
        this.etat = etat;
    }



    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
