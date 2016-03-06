package com.javatpoint;

import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class QuestionToXml {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Question.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Answer ans1 = new Answer(101, "Java is a programming language.", "David");
		Answer ans2 = new Answer(102, "Java is a platform.", "John");
		
		ArrayList<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		
		Question que = new Question(1, "What is Java?", list);
		marshaller.marshal(que, new FileOutputStream("question.xml"));

	}

}
