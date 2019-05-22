/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.Objects;

/**
 *
 * @author JAIN
 */
public class StudentScore {

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentScore other = (StudentScore) obj;
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (Double.doubleToLongBits(this.per) != Double.doubleToLongBits(other.per)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentScore{" + "language=" + language + ", per=" + per + '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }
    public StudentScore() {
    }
    

    public StudentScore(String language, double per) {
        this.language = language;
        this.per = per;
    }
    private String language;
    private double per;
}
