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
public class AnswerStore {
    ArrayList<AnswerPojo> answerList;
    public AnswerStore() {
        answerList=new ArrayList<>();
    }
    public void addAnswer(AnswerPojo answer) {
        answerList.add(answer);
        
    }
    public AnswerPojo getAnswer(int pos) {
        return answerList.get(pos);
        
    }
     public void removeAnswer(int pos) {
     answerList.remove(pos);
     
     }
     public void setAnswerAt(int pos,AnswerPojo answer) {
     answerList.add(pos,answer);
     }
     public ArrayList<AnswerPojo> getAllAnswers() {
     return answerList;
     }
     public int getCount() {
     return answerList.size();
     }
     public AnswerPojo getAnswerByQno(int qno) {
         for(AnswerPojo answer:answerList) {
             if(answer.getQno()==qno)
                 return answer;             
         }
         return null;
         }
     
         public int removeAnswer(AnswerPojo answer) {
             int pos=answerList.indexOf(answer);
             answerList.remove(pos);
             return pos;
         }
         
     }


