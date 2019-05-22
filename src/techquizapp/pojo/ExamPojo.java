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
public class ExamPojo {

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ExamPojo other = (ExamPojo) obj;
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (this.totalQuestions != other.totalQuestions) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExamPojo{" + "examId=" + examId + ", language=" + language + ", totalQuestions=" + totalQuestions + '}';
    }
    public ExamPojo() {
    }
    
  

    public ExamPojo(String examId, String language, int totalQuestions) {
        this.examId = examId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public String getExamId() {
        return examId;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
    private String examId;
    private String language;
    private int totalQuestions;
          
    
}
