/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author JAIN
 */
public class QuestionStore {
    ArrayList <QuestionPojo> questionList;
    public QuestionStore() {
        questionList=new ArrayList<>();
    }
    public void addQuestion(QuestionPojo q) 
    {
        questionList.add(q);
        
    }
        public QuestionPojo getQuestion(int pos){
        return questionList.get(pos);
    }
   public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,QuestionPojo q){
        questionList.add(pos, q);
    }
    public ArrayList<QuestionPojo> getAllQuestions(){
        return questionList;
    }
    public int getCount(){
        return questionList.size();
    }
}

    

