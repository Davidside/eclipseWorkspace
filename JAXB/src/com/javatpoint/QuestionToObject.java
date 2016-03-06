package com.javatpoint;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class QuestionToObject {

	public static void main(String[] args) {
		
		try {
			File file = new File("Question.xml");
			JAXBContext context = JAXBContext.newInstance(Question.class);
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Question que = (Question) unmarshaller.unmarshal(file);
			
			System.out.println(que.getId() + " " + que.getQuestionName());
			System.out.println("Answers:");
			List<Answer> list = que.getAnswers();
			for(Answer ans : list) {
				System.out.println(ans.getId() + " " + ans.getAnswerName() + " " + ans.getPostedBy());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
